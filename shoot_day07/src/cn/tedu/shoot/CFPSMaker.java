package cn.tedu.shoot;
import java.text.DecimalFormat;

/**
 * <p>Title: LoonFramework</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: LoonFramework</p>
 * @author chenpeng   
 * @email ceponline@yahoo.com.cn 
 * @version 0.1
 *
 */
public class CFPSMaker
{
    /**
     * �趨�������ж���֡��ͳ��һ��֡�� 
     */
    public static final int FPS = 8;  
 
    /**
     * ����Ϊ��������
     * ��λ: ns(����)
     */
    public static final long PERIOD = (long) (1.0 / FPS * 1000000000); 
    /**
     * FPS�����ʱ�䣬����Ϊ1s = 10^9ns 
     * ��λ: ns
     */
    public static long FPS_MAX_INTERVAL = 1000000000L; 
    
    /**
     * ʵ�ʵ�FPS��ֵ
     */
    private double nowFPS = 0.0;
    
    /**
     * FPS�ۼ��ü��ʱ��
     * in ns
     */
    private long interval = 0L;
    private long time;
    /**
     * �������ۼ� 
     */
    private long frameCount = 0;
    
    /**
     * ��ʽ��С��λ�� 
     */
    private DecimalFormat df = new DecimalFormat("0.0"); 
    
    /**
     * ����FPS����
     * 
     */
    public void makeFPS()
    {
        frameCount++;
        interval += PERIOD;
        //��ʵ�ʼ������ʱ��ʱ��
        if (interval >= FPS_MAX_INTERVAL)
        {
            //nanoTime()������׼ȷ�Ŀ���ϵͳ��ʱ���ĵ�ǰֵ���Ժ�΢��Ϊ��λ
            long timeNow = System.nanoTime();
            // ��õ�ĿǰΪֹ��ʱ�����
            long realTime = timeNow - time; // ��λ: ns
            //����Ϊʵ�ʵ�fps��ֵ
            nowFPS = ((double) frameCount / realTime) * FPS_MAX_INTERVAL;
            
            //�����ֵ
            frameCount = 0L;
            interval = 0L;
            time = timeNow;
        }
    }
    
    public long getFrameCount()
    {
        return frameCount;
    }
    
    public void setFrameCount(long frameCount)
    {
        this.frameCount = frameCount;
    }
    
    public long getInterval()
    {
        return interval;
    }
    
    public void setInterval(long interval)
    {
        this.interval = interval;
    }
    
    public double getNowFPS()
    {
        return nowFPS;
    }
    
    public void setNowFPS(double nowFPS)
    {
        this.nowFPS = nowFPS;
    }
    
    public long getTime()
    {
        return time;
    }
    
    public void setTime(long time)
    {
        this.time = time;
    }
    
    public String getFPS()
    {
        return df.format(nowFPS);
    }
}