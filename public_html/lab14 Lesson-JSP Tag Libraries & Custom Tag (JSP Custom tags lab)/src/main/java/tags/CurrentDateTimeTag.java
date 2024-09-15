package tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CurrentDateTimeTag extends SimpleTagSupport {
    private String color = "black";
    private String size = "14px";

    
    public void setColor(String color) {
        this.color = color != null ? color : this.color; 
    }

    
    public void setSize(String size) {
        this.size = size != null ? size : this.size;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String formattedDate = dateFormat.format(currentDate);

        out.write(String.format(
            "<span style='color: %s; font-size: %s;'>%s</span>",
            color, size, formattedDate
        ));
    }
}