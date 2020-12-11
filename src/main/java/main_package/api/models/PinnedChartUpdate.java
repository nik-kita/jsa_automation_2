package main_package.api.models;

public class PinnedChartUpdate {
    private String chart;
    private int custom_chart_id;

    @Override
    public String toString() {
        return "PinnedChartUpdate{" +
                "chart='" + chart + '\'' +
                ", custom_chart_id=" + custom_chart_id +
                '}';
    }

    public String getChart() {
        return chart;
    }

    public PinnedChartUpdate setChart(String chart) {
        this.chart = chart;
        return this;
    }

    public int getCustom_chart_id() {
        return custom_chart_id;
    }

    public PinnedChartUpdate setCustom_chart_id(int custom_chart_id) {
        this.custom_chart_id = custom_chart_id;
        return this;
    }
}
