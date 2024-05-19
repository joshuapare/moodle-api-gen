# MoodleClient.Model.CoreMessageGetConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Conversationid** | **int** | The id of the conversation to fetch | [default to null]
**Includecontactrequests** | **bool** | Include contact requests in the members | [default to null]
**Includeprivacyinfo** | **bool** | Include privacy info in the members | [default to null]
**Memberlimit** | **int** | Limit for number of members | [optional] [default to 0]
**Memberoffset** | **int** | Offset for member list | [optional] [default to 0]
**Messagelimit** | **int** | Limit for number of messages | [optional] [default to 100]
**Messageoffset** | **int** | Offset for messages list | [optional] [default to 0]
**Newestmessagesfirst** | **bool** | Order messages by newest first | [optional] [default to true]
**Userid** | **int** | The id of the user who we are viewing conversations for | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

