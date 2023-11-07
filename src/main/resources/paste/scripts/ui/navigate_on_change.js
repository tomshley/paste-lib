/**
 * @requires paste/dom
 * @requires paste/event
 * @module paste/ui/navigate_on_change
 */

paste.define(
    'paste.ui.navigate_on_change',
    [
        'paste.dom',
        'paste.event'
    ],
    function (module, dom, event) {
        'use strict';
        var DATA_ATTR = "data-navigate-on-change";

        event['bind']('change', document.documentElement, function(e) {
            var $el = event['getEventTarget'](e);
            if($el.hasAttribute(DATA_ATTR) && $el.getAttribute(DATA_ATTR).toLowerCase() == "true") {
                window.location = $el.value;
            }
        });
    }
);
