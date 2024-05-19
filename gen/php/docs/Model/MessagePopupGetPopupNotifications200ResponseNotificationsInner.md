# # MessagePopupGetPopupNotifications200ResponseNotificationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **string** | The component that generated the notification | [optional]
**contexturl** | **string** | Context URL | [optional]
**contexturlname** | **string** | Context URL link name | [optional]
**customdata** | **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional]
**deleted** | **bool** | notification deletion status | [optional] [default to null]
**eventtype** | **string** | The type of notification | [optional]
**fullmessage** | **string** | The message | [optional]
**fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional]
**fullmessagehtml** | **string** | The message in html | [optional]
**iconurl** | **string** | URL for notification icon | [optional] [default to 'null']
**id** | **int** | Notification id (this is not guaranteed to be unique                                 within this result set) | [optional] [default to null]
**read** | **bool** | notification read status | [optional] [default to null]
**shortenedsubject** | **string** | The notification subject shortened                                 with ellipsis | [optional] [default to 'null']
**smallmessage** | **string** | The shorten message | [optional]
**subject** | **string** | The notification subject | [optional] [default to 'null']
**text** | **string** | The message text formated | [optional]
**timecreated** | **int** | Time created | [optional]
**timecreatedpretty** | **string** | Time created in a pretty format | [optional] [default to 'null']
**timeread** | **int** | Time read | [optional]
**useridfrom** | **int** | User from id | [optional]
**useridto** | **int** | User to id | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
