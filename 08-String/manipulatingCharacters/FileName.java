package manipulatingCharacters;

public class FileName {
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public FileName(String fullPath, char pathSeparator, char extensionSeparator) {
        this.fullPath = fullPath;
        this.pathSeparator = pathSeparator;
        this.extensionSeparator = extensionSeparator;
    }

    public String getExtension() {
        int dot = this.fullPath.lastIndexOf(extensionSeparator);
        return this.fullPath.substring(dot + 1);
    }

    public String getFileName() {
        int dot = this.fullPath.lastIndexOf(extensionSeparator);
        int pathSep = this.fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(pathSep + 1, dot);
    }

    public String getPath() {
        int pathSep = this.fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, pathSep);
    }

    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileName f = new FileName(FPATH, '/', '.');
        System.out.println("文件后缀名为：" + f.getExtension());
        System.out.println("文件名为：" + f.getFileName());
        System.out.println("文件路径为：" + f.getPath());
    }
}
