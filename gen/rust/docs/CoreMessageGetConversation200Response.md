# CoreMessageGetConversation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | Option<**bool**> | If the user can delete messages in the conversation for all users | [optional][default to false]
**id** | **i32** | The conversation id | [default to null]
**imageurl** | Option<**String**> | A link to the conversation picture, if set | [optional][default to null]
**isfavourite** | **bool** | If the user marked this conversation as a favourite | [default to null]
**ismuted** | **bool** | If the user muted this conversation | [default to null]
**isread** | **bool** | If the user has read all messages in the conversation | [default to null]
**membercount** | **i32** | Total number of conversation members | [default to null]
**members** | [**Vec<models::CoreMessageGetConversation200ResponseMembersInner>**](core_message_get_conversation_200_response_members_inner.md) |  | 
**messages** | [**Vec<models::CoreMessageGetConversation200ResponseMessagesInner>**](core_message_get_conversation_200_response_messages_inner.md) |  | 
**name** | Option<**String**> | The conversation name, if set | [optional][default to null]
**subname** | Option<**String**> | A subtitle for the conversation name, if set | [optional][default to null]
**r#type** | **i32** | The type of the conversation (1=individual,2=group,3=self) | [default to null]
**unreadcount** | Option<**i32**> | The number of unread messages in this conversation | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


