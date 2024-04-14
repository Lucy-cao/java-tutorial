public class ApiException extends Exception {
    private String retCd;//异常返回码
    private String msgDes;//异常的描述信息

    public ApiException() {
        super();
    }

    public ApiException(String message) {
        super(message);
        this.msgDes = message;
    }

    public ApiException(String retCd, String msgDes) {
        super();
        this.retCd = retCd;
        this.msgDes = msgDes;
    }

    public String getRetCd() {
        return this.retCd;
    }

    public String getMsgDes() {
        return this.msgDes;
    }
}
