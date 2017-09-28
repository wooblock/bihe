package com.inesv.digiccy.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import java.io.InputStream;
import java.util.UUID;
 

/**
 * Created by SKINK on 2017/5/8.
 */
public class QiniuUploadUtil {

	private static String accessKey = "pb_1o0pcg_2VrhLrcpvxkmQLu8Dfk6wZyS_fVfJg";
	private static String secretKey = "9Ii2z80iq5Bu5UmfVaOaDpoAXBrqw1Hmb9f6tNjd";
	private static String bucket = "dhs-wallet";
	private static String startStaff = "http://opd74myxl.bkt.clouddn.com/";

	/*
	 * public QiniuUploadUtil(String accessKey, String secretKey, String bucket)
	 * { this.accessKey = accessKey; this.secretKey = secretKey; this.bucket =
	 * bucket; }
	 */

	public static String getStartStaff() {
		return startStaff;
	}

	public static String upLoadImage(InputStream inputStream, String fileName) {
		// 构造一个带指定Zone对象的配置类
		Configuration cfg = new Configuration(Zone.zone2());
		// ...其他参数参考类注释
		UploadManager uploadManager = new UploadManager(cfg);
		// ...生成上传凭证，然后准备上传
		// String accessKey = "your access key";
		// String secretKey = "your secret key";
		// String bucket = "your bucket name";
		// 默认不指定key的情况下，以文件内容的hash值作为文件名

		// String key = null;
		// byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
		// ByteArrayInputStream byteInputStream=new
		// ByteArrayInputStream(uploadBytes);

		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		DefaultPutRet putRet = null;

		try {
			Response response = uploadManager.put(inputStream, fileName,
					upToken, null, null);
			// 解析上传成功的结果
			putRet = new Gson().fromJson(response.bodyString(),
					DefaultPutRet.class);

			System.out.println(putRet.key);
			System.out.println(putRet.hash);

		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {
				// ignore
			}
		}
		return putRet.key;
	}
	
	
	public static String createFileName(String mime) {	// 需要创建一个文件名称
		String fileName = UUID.randomUUID()+"_"+mime + ".jpg";
		return fileName;
	}

}
