package org.bk.until;

import java.text.DecimalFormat;

import org.springframework.stereotype.Component;
@Component
public class MathUtils {
private static DecimalFormat decimalFormat = new DecimalFormat("#.00");//取两位小数
public static DecimalFormat getTwoDeciFormat(){
	return decimalFormat;
}
}
