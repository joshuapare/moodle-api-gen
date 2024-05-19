# CoreMessageGetConversations200ResponseConversationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**candeletemessagesforallusers** | Option<**bool**> | If the user can delete messages in the conversation for all users | [optional][default to false]
**id** | Option<**i32**> | The conversation id | [optional]
**imageurl** | Option<**String**> | A link to the conversation picture, if set | [optional]
**isfavourite** | Option<**bool**> | If the user marked this conversation as a favourite | [optional]
**ismuted** | Option<**bool**> | If the user muted this conversation | [optional]
**isread** | Option<**bool**> | If the user has read all messages in the conversation | [optional]
**membercount** | Option<**i32**> | Total number of conversation members | [optional]
**members** | Option<[**Vec<models::CoreMessageGetConversationBetweenUsers200ResponseMembersInner>**](core_message_get_conversation_between_users_200_response_members_inner.md)> |  | [optional]
**messages** | Option<[**Vec<models::CoreMessageGetConversationBetweenUsers200ResponseMessagesInner>**](core_message_get_conversation_between_users_200_response_messages_inner.md)> |  | [optional]
**name** | Option<**String**> | The conversation name, if set | [optional]
**subname** | Option<**String**> | A subtitle for the conversation name, if set | [optional]
**r#type** | Option<**i32**> | The type of the conversation (1=individual,2=group,3=self) | [optional]
**unreadcount** | Option<**i32**> | The number of unread messages in this conversation | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


