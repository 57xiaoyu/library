package com.fengwenyi.app.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fengwenyi.app.R;

/**
 * WenyiFeng(xfsy2014@gmail.com)
 * 2017-07-24 11:26
 */

public class ProgressDialogWenyiFeng {

    private static int[] iconStyles = { R.drawable.icon_progress_style1,
            R.drawable.icon_progress_style2, R.drawable.icon_progress_style3,
            R.drawable.icon_progress_style4 };
    private static ProgressDialog pd;
    /** ICON 为太极 */
    public static final int THEME_ULTIMATE = 0;
    /** ICON 为点 */
    public static final int THEME_DOT = 1;
    /** ICON 为弧线 */
    public static final int THEME_LINE = 2;
    /** ICON 为线条 */
    public static final int THEME_ARC = 3;

    /**
     * show
     * @param context
     * @param message  提示信息
     * @param theme    样式
     * @param isCanceledOnTouchOutside  点击外边距不可取消,true 可取消
     * @param isCancelable 点击back键不可取消
     */
    public static void show(Context context,
                            String message,
                            int theme,
                            boolean isCanceledOnTouchOutside,
                            boolean isCancelable
    ) {

        // 创建ProgressDialog对象
        pd = new ProgressDialog(context, R.style.progressDialogWenyiFeng);
        // false 设置点击外边距不可取消,true 可取消
        pd.setCanceledOnTouchOutside(isCanceledOnTouchOutside);
        // 设置点击back键不可取消
        pd.setCancelable(isCancelable);
        // 加载自定义的ProgressDialog
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        View view = LayoutInflater.from(context).inflate(
                R.layout.succinct_progress_content, null);
        ImageView mProgressIcon = (ImageView) view
                .findViewById(R.id.progress_icon);
        // 设置样式
        mProgressIcon.setImageResource(iconStyles[theme]);
        TextView mProgressMessage = (TextView) view
                .findViewById(R.id.progress_message);
        // 设置内容
        mProgressMessage.setText(message);
        new AnimationUtils();
        // 设置动画
        Animation jumpAnimation = AnimationUtils.loadAnimation(context,
                R.anim.anim_progress_dialog_wenyi_feng);
        mProgressIcon.startAnimation(jumpAnimation);
        // 显示
        pd.show();
        // 必须先显示，在设置自定义的View
        pd.setContentView(view, params);

    }

    /**
     * @return true显示中，false 隐藏中
     */
    public static boolean isShowing() {

        if (pd != null && pd.isShowing()) {

            return true;
        }
        return false;

    }

    /**
     * dialog cancel
     */
    public static void dismiss() {

        if (isShowing()) {

            pd.dismiss();
        }

    }

}
