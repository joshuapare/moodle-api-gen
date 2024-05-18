# CoreMessageGetConversation200ResponseMembersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canmessage** | Option<**bool**> | If the user can be messaged | [optional][default to null]
**canmessageevenifblocked** | Option<**bool**> | If the user can still message even if they get blocked | [optional][default to null]
**contactrequests** | Option<[**Vec<models::CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner>**](core_message_get_conversation_200_response_members_inner_contactrequests_inner.md)> |  | [optional]
**conversations** | Option<[**Vec<models::CoreMessageGetConversation200ResponseMembersInnerConversationsInner>**](core_message_get_conversation_200_response_members_inner_conversations_inner.md)> |  | [optional]
**fullname** | Option<**String**> | The user's name | [optional]
**id** | Option<**i32**> | The user id | [optional]
**isblocked** | Option<**bool**> | If the user has been blocked | [optional]
**iscontact** | Option<**bool**> | Is the user a contact? | [optional][default to null]
**isdeleted** | Option<**bool**> | Is the user deleted? | [optional][default to null]
**isonline** | Option<**bool**> | The user's online status | [optional]
**profileimageurl** | Option<**String**> | User picture URL | [optional]
**profileimageurlsmall** | Option<**String**> | Small user picture URL | [optional]
**profileurl** | Option<**String**> | The link to the user's profile page | [optional][default to null]
**requirescontact** | Option<**bool**> | If the user requires to be contacts | [optional][default to null]
**showonlinestatus** | Option<**bool**> | Show the user's online status? | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


