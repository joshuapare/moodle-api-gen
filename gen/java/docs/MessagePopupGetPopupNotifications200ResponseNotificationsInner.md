

# MessagePopupGetPopupNotifications200ResponseNotificationsInner

message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**component** | **String** | The component that generated the notification |  [optional] |
|**contexturl** | **String** | Context URL |  [optional] |
|**contexturlname** | **String** | Context URL link name |  [optional] |
|**customdata** | **String** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). |  [optional] |
|**deleted** | **Boolean** | notification deletion status |  [optional] |
|**eventtype** | **String** | The type of notification |  [optional] |
|**fullmessage** | **String** | The message |  [optional] |
|**fullmessageformat** | **Integer** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**fullmessagehtml** | **String** | The message in html |  [optional] |
|**iconurl** | **String** | URL for notification icon |  [optional] |
|**id** | **Integer** | Notification id (this is not guaranteed to be unique                                 within this result set) |  [optional] |
|**read** | **Boolean** | notification read status |  [optional] |
|**shortenedsubject** | **String** | The notification subject shortened                                 with ellipsis |  [optional] |
|**smallmessage** | **String** | The shorten message |  [optional] |
|**subject** | **String** | The notification subject |  [optional] |
|**text** | **String** | The message text formated |  [optional] |
|**timecreated** | **Integer** | Time created |  [optional] |
|**timecreatedpretty** | **String** | Time created in a pretty format |  [optional] |
|**timeread** | **Integer** | Time read |  [optional] |
|**useridfrom** | **Integer** | User from id |  [optional] |
|**useridto** | **Integer** | User to id |  [optional] |



