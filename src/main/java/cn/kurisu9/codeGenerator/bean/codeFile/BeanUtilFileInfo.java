package cn.kurisu9.codeGenerator.bean.codeFile;

/**
 * Created by ym on 2017/2/23 0023.
 */
public class BeanUtilFileInfo extends CodeFileInfo {
    /**
     * 类名
     * */
    public static final String CLASS_NAME = "BeanUtil";

    private static final String DEFAULT_FILE_NAME = CLASS_NAME.concat(".java");

    private static final String DEFAULT_TEMPLATE_NAME = CLASS_NAME.concat(".ftl");

    public BeanUtilFileInfo() {
        setFileName(DEFAULT_FILE_NAME);
        setTemplateName(DEFAULT_TEMPLATE_NAME);
    }
}