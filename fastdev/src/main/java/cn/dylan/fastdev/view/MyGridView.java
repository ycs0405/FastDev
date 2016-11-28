package cn.dylan.fastdev.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * File_name com.dy.logs.mp.ui.MyGridView
 * @author linglongxin24 <br/>
 * @date create at 2014-6-6下午2:07:04 <br/>
 * @time update at 2014-6-6下午2:07:04
 */

/**
 * 自定义gridview，解决ListView中嵌套gridview显示不正常的问题（1行半）
 * 
 * @author wangyx
 * @version 1.0.0 2012-9-14
 */
public class MyGridView extends GridView {
	public MyGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyGridView(Context context) {
		super(context);
	}

	public MyGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}