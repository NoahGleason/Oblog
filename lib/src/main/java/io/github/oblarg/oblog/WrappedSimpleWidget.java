package io.github.oblarg.oblog;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;

import java.util.Map;

class WrappedSimpleWidget implements SimpleWidgetWrapper {

    private SimpleWidget widget;

    WrappedSimpleWidget(SimpleWidget component) {
        this.widget = component;
    }

    @Override
    public NetworkTableEntry getEntry() {
        return widget.getEntry();
    }

    @Override
    public SimpleWidgetWrapper withProperties(Map<String, Object> properties) {
        widget = widget.withProperties(properties);
        return this;
    }

    @Override
    public SimpleWidgetWrapper withWidget(String widgetType) {
        widget = widget.withWidget(widgetType);
        return this;
    }
}