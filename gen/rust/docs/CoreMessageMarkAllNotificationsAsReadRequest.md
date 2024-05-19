# CoreMessageMarkAllNotificationsAsReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timecreatedto** | Option<**i32**> | mark messages created before this time as read, 0 for all messages | [optional][default to 0]
**useridfrom** | Option<**i32**> | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional][default to 0]
**useridto** | **i32** | the user id who received the message, 0 for any user | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


