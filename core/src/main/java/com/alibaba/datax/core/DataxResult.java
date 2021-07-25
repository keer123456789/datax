package com.alibaba.datax.core;

/**
 * @author keer
 * @title: DataxResult
 * @projectName datax-all
 * @description: TODO
 * @date 2020/10/2621:49
 */
public class DataxResult {
    //任务启动时刻
    private long startTimeStamp;
    //任务结束时刻
    private long endTimeStamp;
    //任务总时耗
    private long totalCosts;
    //任务平均流量
    private long byteSpeedPerSecond;
    //记录写入速度
    private long recordSpeedPerSecond;
    //读出记录总数
    private long totalReadRecords;
    //读写失败总数
    private long totalErrorRecords;
    //成功记录总数
    private long transformerSucceedRecords;
    // 失败记录总数
    private long transformerFailedRecords;
    // 过滤记录总数
    private long transformerFilterRecords;
    //字节数
    private long readSucceedBytes;
    //转换开始时间
    private long endTransferTimeStamp;
    //转换结束时间
    private long startTransferTimeStamp;
    //转换总耗时
    private long transferCosts;

    public DataxResult() {
    }

    public long getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public long getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public long getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(long totalCosts) {
        this.totalCosts = totalCosts;
    }

    public long getByteSpeedPerSecond() {
        return byteSpeedPerSecond;
    }

    public void setByteSpeedPerSecond(long byteSpeedPerSecond) {
        this.byteSpeedPerSecond = byteSpeedPerSecond;
    }

    public long getRecordSpeedPerSecond() {
        return recordSpeedPerSecond;
    }

    public void setRecordSpeedPerSecond(long recordSpeedPerSecond) {
        this.recordSpeedPerSecond = recordSpeedPerSecond;
    }

    public long getTotalReadRecords() {
        return totalReadRecords;
    }

    public void setTotalReadRecords(long totalReadRecords) {
        this.totalReadRecords = totalReadRecords;
    }

    public long getTotalErrorRecords() {
        return totalErrorRecords;
    }

    public void setTotalErrorRecords(long totalErrorRecords) {
        this.totalErrorRecords = totalErrorRecords;
    }

    public long getTransformerSucceedRecords() {
        return transformerSucceedRecords;
    }

    public void setTransformerSucceedRecords(long transformerSucceedRecords) {
        this.transformerSucceedRecords = transformerSucceedRecords;
    }

    public long getTransformerFailedRecords() {
        return transformerFailedRecords;
    }

    public void setTransformerFailedRecords(long transformerFailedRecords) {
        this.transformerFailedRecords = transformerFailedRecords;
    }

    public long getTransformerFilterRecords() {
        return transformerFilterRecords;
    }

    public void setTransformerFilterRecords(long transformerFilterRecords) {
        this.transformerFilterRecords = transformerFilterRecords;
    }

    public long getReadSucceedBytes() {
        return readSucceedBytes;
    }

    public void setReadSucceedBytes(long readSucceedBytes) {
        this.readSucceedBytes = readSucceedBytes;
    }

    public long getEndTransferTimeStamp() {
        return endTransferTimeStamp;
    }

    public void setEndTransferTimeStamp(long endTransferTimeStamp) {
        this.endTransferTimeStamp = endTransferTimeStamp;
    }

    public long getStartTransferTimeStamp() {
        return startTransferTimeStamp;
    }

    public void setStartTransferTimeStamp(long startTransferTimeStamp) {
        this.startTransferTimeStamp = startTransferTimeStamp;
    }

    public long getTransferCosts() {
        return transferCosts;
    }

    public void setTransferCosts(long transferCosts) {
        this.transferCosts = transferCosts;
    }

    public DataxResult getResultMsg(long startTimeStamp,
                                    long endTimeStamp,
                                    long totalCosts,
                                    long byteSpeedPerSecond,
                                    long recordSpeedPerSecond,
                                    long totalReadRecords,
                                    long totalErrorRecords,
                                    long transformerSucceedRecords,
                                    long transformerFailedRecords,
                                    long transformerFilterRecords,
                                    long readSucceedBytes,
                                    long endTransferTimeStamp,
                                    long startTransferTimeStamp,
                                    long transferCosts){
        this.startTimeStamp=startTimeStamp;
        this.endTimeStamp=endTimeStamp;
        this.totalCosts=totalCosts;
        this.byteSpeedPerSecond=byteSpeedPerSecond;
        this.recordSpeedPerSecond=recordSpeedPerSecond;
        this.totalReadRecords=totalReadRecords;
        this.totalErrorRecords=totalErrorRecords;
        this.transformerSucceedRecords=transformerSucceedRecords;
        this.transformerFailedRecords=transformerFailedRecords;
        this.transformerFilterRecords=transformerFilterRecords;
        this.readSucceedBytes=readSucceedBytes;
        this.endTransferTimeStamp=endTransferTimeStamp;
        this.startTransferTimeStamp=startTransferTimeStamp;
        this.transferCosts=transferCosts;
        return this;
    }

    @Override
    public String toString() {
        return "DataxResult{" +
                "startTimeStamp=" + startTimeStamp +
                ", endTimeStamp=" + endTimeStamp +
                ", totalCosts=" + totalCosts +
                ", byteSpeedPerSecond=" + byteSpeedPerSecond +
                ", recordSpeedPerSecond=" + recordSpeedPerSecond +
                ", totalReadRecords=" + totalReadRecords +
                ", totalErrorRecords=" + totalErrorRecords +
                ", transformerSucceedRecords=" + transformerSucceedRecords +
                ", transformerFailedRecords=" + transformerFailedRecords +
                ", transformerFilterRecords=" + transformerFilterRecords +
                ", readSucceedBytes=" + readSucceedBytes +
                ", endTransferTimeStamp=" + endTransferTimeStamp +
                ", startTransferTimeStamp=" + startTransferTimeStamp +
                ", transferCosts=" + transferCosts +
                '}';
    }
}
