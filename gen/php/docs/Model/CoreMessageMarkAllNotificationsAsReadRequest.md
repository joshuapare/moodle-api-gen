# # CoreMessageMarkAllNotificationsAsReadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timecreatedto** | **int** | mark messages created before this time as read, 0 for all messages | [optional] [default to 0]
**useridfrom** | **int** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**useridto** | **int** | the user id who received the message, 0 for any user |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
