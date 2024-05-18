

# CoreMessageGetMessages200ResponseMessagesInner

message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**component** | **String** | The component that generated the notification |  [optional] |
|**contexturl** | **String** | Context URL |  [optional] |
|**contexturlname** | **String** | Context URL link name |  [optional] |
|**customdata** | **String** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). |  [optional] |
|**eventtype** | **String** | The type of notification |  [optional] |
|**fullmessage** | **String** | The message |  [optional] |
|**fullmessageformat** | **Integer** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**fullmessagehtml** | **String** | The message in html |  [optional] |
|**iconurl** | **String** | URL for icon, only for notifications. |  [optional] |
|**id** | **Integer** | Message id |  [optional] |
|**notification** | **Integer** | Is a notification? |  [optional] |
|**smallmessage** | **String** | The shorten message |  [optional] |
|**subject** | **String** | The message subject |  [optional] |
|**text** | **String** | The message text formated |  [optional] |
|**timecreated** | **Integer** | Time created |  [optional] |
|**timeread** | **Integer** | Time read |  [optional] |
|**userfromfullname** | **String** | User from full name |  [optional] |
|**useridfrom** | **Integer** | User from id |  [optional] |
|**useridto** | **Integer** | User to id |  [optional] |
|**usertofullname** | **String** | User to full name |  [optional] |



