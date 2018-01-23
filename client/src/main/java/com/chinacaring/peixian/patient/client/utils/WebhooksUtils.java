package com.chinacaring.peixian.patient.client.utils;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author xjh1994
 * @date 2017/11/2
 * @intro
 */
public class WebhooksUtils {

    /**
     * 验证
     * @param rawData
     * @param signature
     * @return
     */
    public static boolean verify(String rawData, String signature) {
        try {
            boolean result = verifyData(rawData, signature, getPubKey());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 获得公钥
     * @return
     * @throws Exception
     */
    public static PublicKey getPubKey() throws Exception {
        String pubKeyString = "-----BEGIN PUBLIC KEY-----\n" +
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtkeOJuzap+bxH0InmVTQ\n" +
                "Ep0VTsF8NDw1FZHe3gDnzXYVhf0MFCtXMKqPdmktsbCeZULYc0zwPPJRLLFoRVs9\n" +
                "wM97SRYJM1OlaZpZj0+41lfRMASGpwSn3be7k3qhrlQGvHuf/ZlKTwkG0PBljmm4\n" +
                "2h1suQagmBKR2fBAbuw+JyY4bsmikk7g6XybXtpjLu2YgtEg+6eEJiUCddDUsk3u\n" +
                "2Jxi38AP0fKbUK96shWiBAkzNFIb93UZNFOeUiADYsDeKuCscuUjgqvw8l88T8cG\n" +
                "ZFegFYksEevrZkibGd8t3gzWorAd4btIbUqJS0DkbS41FlWJ2FDGmi959Ia9+O9g\n" +
                "wQIDAQAB\n" +
                "-----END PUBLIC KEY-----\n";
        pubKeyString = pubKeyString.replaceAll("(-+BEGIN PUBLIC KEY-+\\r?\\n|-+END PUBLIC KEY-+\\r?\\n?)", "");
        byte[] keyBytes = Base64.decodeBase64(pubKeyString);

        // generate public key
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(spec);
        return publicKey;
    }

    /**
     * 验证签名
     * @param dataString
     * @param signatureString
     * @param publicKey
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws SignatureException
     */
    public static boolean verifyData(String dataString, String signatureString, PublicKey publicKey)
            throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        byte[] signatureBytes = Base64.decodeBase64(signatureString);
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);
        signature.update(dataString.getBytes("UTF-8"));
        return signature.verify(signatureBytes);
    }
}
