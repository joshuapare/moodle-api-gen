# Org.OpenAPITools.Model.CoreMessageGetConversationBetweenUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Candeletemessagesforallusers** | **bool** | If the user can delete messages in the conversation for all users | [optional] [default to false]
**Id** | **int** | The conversation id | 
**Imageurl** | **string** | A link to the conversation picture, if set | [optional] 
**Isfavourite** | **bool** | If the user marked this conversation as a favourite | 
**Ismuted** | **bool** | If the user muted this conversation | 
**Isread** | **bool** | If the user has read all messages in the conversation | 
**Membercount** | **int** | Total number of conversation members | 
**Members** | [**List&lt;CoreMessageGetConversationBetweenUsers200ResponseMembersInner&gt;**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  | 
**Messages** | [**List&lt;CoreMessageGetConversationBetweenUsers200ResponseMessagesInner&gt;**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  | 
**Name** | **string** | The conversation name, if set | [optional] 
**Subname** | **string** | A subtitle for the conversation name, if set | [optional] 
**Type** | **int** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) | 
**Unreadcount** | **int** | The number of unread messages in this conversation | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

