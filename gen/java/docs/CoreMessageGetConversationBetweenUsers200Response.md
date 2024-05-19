

# CoreMessageGetConversationBetweenUsers200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**candeletemessagesforallusers** | **Boolean** | If the user can delete messages in the conversation for all users |  [optional] |
|**id** | **Integer** | The conversation id |  |
|**imageurl** | **String** | A link to the conversation picture, if set |  [optional] |
|**isfavourite** | **Boolean** | If the user marked this conversation as a favourite |  |
|**ismuted** | **Boolean** | If the user muted this conversation |  |
|**isread** | **Boolean** | If the user has read all messages in the conversation |  |
|**membercount** | **Integer** | Total number of conversation members |  |
|**members** | [**List&lt;CoreMessageGetConversationBetweenUsers200ResponseMembersInner&gt;**](CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md) |  |  |
|**messages** | [**List&lt;CoreMessageGetConversationBetweenUsers200ResponseMessagesInner&gt;**](CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md) |  |  |
|**name** | **String** | The conversation name, if set |  [optional] |
|**subname** | **String** | A subtitle for the conversation name, if set |  [optional] |
|**type** | **Integer** | The type of the conversation (1&#x3D;individual,2&#x3D;group,3&#x3D;self) |  |
|**unreadcount** | **Integer** | The number of unread messages in this conversation |  [optional] |



