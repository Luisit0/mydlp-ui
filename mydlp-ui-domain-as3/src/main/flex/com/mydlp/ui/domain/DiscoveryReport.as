/**
 * Generated by Gas3 v2.0.0 (Granite Data Services).
 *
 * NOTE: this file is only generated if it does not exist. You may safely put
 * your custom code here.
 */

package com.mydlp.ui.domain {

    [Bindable]
    [RemoteClass(alias="com.mydlp.ui.domain.DiscoveryReport")]
    public class DiscoveryReport extends DiscoveryReportBase {
		public static const STATUS_DISCOVERING:String = "running";
		public static const STATUS_STOPPED:String = "stopped";
		public static const STATUS_PAUSED:String = "paused";
    }
}