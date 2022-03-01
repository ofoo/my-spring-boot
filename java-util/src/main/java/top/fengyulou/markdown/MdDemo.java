package top.fengyulou.markdown;

import com.youbenzi.mdtool.tool.MDTool;

/**
 * @Author guochao
 * @Date 2022/3/1 7:58
 * @Version 1.0
 */
public class MdDemo {
    public static void main(String[] args) {
        String html = MDTool.markdown2Html("```\n" +
                "// Converts canvas to an image\n" +
                "function convertCanvasToImage(canvas) {\n" +
                "\tvar image = new Image();\n" +
                "\timage.src = canvas.toDataURL(\"image/png\");\n" +
                "\treturn image;\n" +
                "}\n" +
                "\n" +
                "// 制作文字图片\n" +
                "https://izihun.com/art-edit/?from=editor&fk=1516\n" +
                "// 输出canvas图片路径\n" +
                "var canvas=$('canvas')[0];\n" +
                "canvas.toDataURL(\"image/png\");\n" +
                "```");
        System.out.println(html);
    }
}
