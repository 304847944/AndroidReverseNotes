package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class el extends c {
    private final int height = 16;
    private final int width = 28;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 28;
            case 1:
                return 16;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-824064);
                Path l = c.l(looper);
                l.moveTo(0.0f, 1.6f);
                l.cubicTo(0.0f, 0.71634436f, 0.71634436f, 0.0f, 1.6f, 0.0f);
                l.lineTo(26.4f, 0.0f);
                l.cubicTo(27.283655f, 0.0f, 28.0f, 0.71634436f, 28.0f, 1.6f);
                l.lineTo(28.0f, 14.4f);
                l.cubicTo(28.0f, 15.283655f, 27.283655f, 16.0f, 26.4f, 16.0f);
                l.lineTo(1.6f, 16.0f);
                l.cubicTo(0.71634436f, 16.0f, 0.0f, 15.283655f, 0.0f, 14.4f);
                l.lineTo(0.0f, 1.6f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-1);
                l = c.l(looper);
                l.moveTo(7.8575f, 7.2671666f);
                l.lineTo(5.9045f, 7.2671666f);
                l.lineTo(5.9045f, 11.267667f);
                l.cubicTo(5.9045f, 11.519667f, 6.041f, 11.656167f, 6.3245f, 11.656167f);
                l.lineTo(8.1515f, 11.656167f);
                l.cubicTo(8.4665f, 11.656167f, 8.666f, 11.572166f, 8.7395f, 11.414667f);
                l.cubicTo(8.8235f, 11.246667f, 8.8865f, 10.889667f, 8.9285f, 10.354167f);
                l.lineTo(9.863f, 10.669167f);
                l.cubicTo(9.779f, 11.582666f, 9.653f, 12.139167f, 9.464f, 12.328167f);
                l.cubicTo(9.296f, 12.496166f, 8.9495f, 12.580167f, 8.4455f, 12.580167f);
                l.lineTo(5.894f, 12.580167f);
                l.cubicTo(5.2325f, 12.580167f, 4.907f, 12.265166f, 4.907f, 11.635167f);
                l.lineTo(4.907f, 6.6476665f);
                l.lineTo(4.403f, 7.1516666f);
                l.lineTo(3.815f, 6.343167f);
                l.cubicTo(4.8125f, 5.4296665f, 5.726f, 4.3481665f, 6.5555f, 3.1091666f);
                l.lineTo(7.2905f, 3.1091666f);
                l.cubicTo(8.2145f, 4.0751667f, 9.0965f, 5.0831666f, 9.9155f, 6.133167f);
                l.lineTo(9.2645f, 6.8156667f);
                l.cubicTo(8.3615f, 5.6186666f, 7.616f, 4.694667f, 7.007f, 4.054167f);
                l.cubicTo(6.461f, 4.8626666f, 5.852f, 5.6396666f, 5.159f, 6.3851666f);
                l.lineTo(8.834f, 6.3851666f);
                l.lineTo(8.834f, 9.283167f);
                l.cubicTo(8.8235f, 9.860666f, 8.5085f, 10.165167f, 7.8785f, 10.207167f);
                l.cubicTo(7.469f, 10.207167f, 7.0805f, 10.196667f, 6.713f, 10.175667f);
                l.lineTo(6.4715f, 9.241167f);
                l.cubicTo(6.86f, 9.283167f, 7.196f, 9.304167f, 7.49f, 9.304167f);
                l.cubicTo(7.7315f, 9.304167f, 7.8575f, 9.178166f, 7.8575f, 8.947166f);
                l.lineTo(7.8575f, 7.2671666f);
                l.close();
                l.moveTo(10.388f, 3.9806666f);
                l.lineTo(11.3645f, 3.9806666f);
                l.lineTo(11.3645f, 10.459167f);
                l.lineTo(10.388f, 10.459167f);
                l.lineTo(10.388f, 3.9806666f);
                l.close();
                l.moveTo(12.2045f, 12.6536665f);
                l.lineTo(10.619f, 12.6536665f);
                l.lineTo(10.388f, 11.698167f);
                l.cubicTo(10.9025f, 11.740167f, 11.396f, 11.761167f, 11.858f, 11.761167f);
                l.cubicTo(12.11f, 11.761167f, 12.236f, 11.603666f, 12.236f, 11.299167f);
                l.lineTo(12.236f, 3.0881667f);
                l.lineTo(13.2335f, 3.0881667f);
                l.lineTo(13.2335f, 11.551167f);
                l.cubicTo(13.2335f, 12.286167f, 12.887f, 12.6536665f, 12.2045f, 12.6536665f);
                l.close();
                l.moveTo(16.793f, 4.474167f);
                l.lineTo(15.155f, 4.474167f);
                l.lineTo(15.155f, 3.6341667f);
                l.lineTo(18.62f, 3.6341667f);
                l.cubicTo(18.536f, 3.4556668f, 18.452f, 3.2876666f, 18.368f, 3.1406667f);
                l.lineTo(19.4495f, 2.9726667f);
                l.cubicTo(19.5335f, 3.1721666f, 19.628f, 3.3926666f, 19.712f, 3.6341667f);
                l.lineTo(23.345f, 3.6341667f);
                l.lineTo(23.345f, 4.474167f);
                l.lineTo(21.6755f, 4.474167f);
                l.lineTo(21.371f, 5.1041665f);
                l.lineTo(23.8385f, 5.1041665f);
                l.lineTo(23.8385f, 5.9651666f);
                l.lineTo(14.6615f, 5.9651666f);
                l.lineTo(14.6615f, 5.1041665f);
                l.lineTo(17.045f, 5.1041665f);
                l.lineTo(16.793f, 4.474167f);
                l.close();
                l.moveTo(18.0845f, 5.1041665f);
                l.lineTo(20.3315f, 5.1041665f);
                l.lineTo(20.636f, 4.474167f);
                l.lineTo(17.8325f, 4.474167f);
                l.lineTo(18.0845f, 5.1041665f);
                l.close();
                l.moveTo(15.7535f, 6.4061666f);
                l.lineTo(22.7465f, 6.4061666f);
                l.lineTo(22.7465f, 9.682167f);
                l.lineTo(15.7535f, 9.682167f);
                l.lineTo(15.7535f, 6.4061666f);
                l.close();
                l.moveTo(21.77f, 8.926167f);
                l.lineTo(21.77f, 8.401167f);
                l.lineTo(16.73f, 8.401167f);
                l.lineTo(16.73f, 8.926167f);
                l.lineTo(21.77f, 8.926167f);
                l.close();
                l.moveTo(16.73f, 7.6871667f);
                l.lineTo(21.77f, 7.6871667f);
                l.lineTo(21.77f, 7.1726665f);
                l.lineTo(16.73f, 7.1726665f);
                l.lineTo(16.73f, 7.6871667f);
                l.close();
                l.moveTo(15.3545f, 10.091667f);
                l.lineTo(16.3205f, 10.291166f);
                l.cubicTo(16.079f, 11.1206665f, 15.743f, 11.834666f, 15.3125f, 12.443666f);
                l.lineTo(14.4515f, 11.908167f);
                l.cubicTo(14.8715f, 11.3411665f, 15.1655f, 10.742666f, 15.3545f, 10.091667f);
                l.close();
                l.moveTo(20.72f, 12.580167f);
                l.lineTo(18.158f, 12.580167f);
                l.cubicTo(17.3495f, 12.580167f, 16.9505f, 12.2126665f, 16.9505f, 11.498667f);
                l.lineTo(16.9505f, 10.154667f);
                l.lineTo(17.9585f, 10.154667f);
                l.lineTo(17.9585f, 11.288667f);
                l.cubicTo(17.9585f, 11.551167f, 18.116f, 11.687667f, 18.4415f, 11.687667f);
                l.lineTo(20.531f, 11.687667f);
                l.cubicTo(20.72f, 11.687667f, 20.8565f, 11.645667f, 20.93f, 11.572166f);
                l.cubicTo(21.035f, 11.477667f, 21.1085f, 11.204667f, 21.1505f, 10.742666f);
                l.lineTo(22.0955f, 11.047167f);
                l.cubicTo(22.0115f, 11.7821665f, 21.8645f, 12.233666f, 21.6335f, 12.380667f);
                l.cubicTo(21.434f, 12.506667f, 21.1295f, 12.580167f, 20.72f, 12.580167f);
                l.close();
                l.moveTo(19.502f, 9.724167f);
                l.cubicTo(19.922f, 10.144167f, 20.237f, 10.511666f, 20.4575f, 10.837167f);
                l.lineTo(19.628f, 11.414667f);
                l.cubicTo(19.3865f, 11.068167f, 19.061f, 10.6796665f, 18.6515f, 10.259666f);
                l.lineTo(19.502f, 9.724167f);
                l.close();
                l.moveTo(22.778f, 9.944667f);
                l.cubicTo(23.3555f, 10.627167f, 23.7965f, 11.225667f, 24.101f, 11.729667f);
                l.lineTo(23.2715f, 12.307167f);
                l.cubicTo(22.946f, 11.740167f, 22.5155f, 11.1206665f, 21.9695f, 10.448667f);
                l.lineTo(22.778f, 9.944667f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
