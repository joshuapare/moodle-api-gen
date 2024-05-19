# ModForumGetForumAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddinstance** | **bool** | Whether the user has the capability mod/forum:addinstance allowed. | [optional] [default to False]
**canaddnews** | **bool** | Whether the user has the capability mod/forum:addnews allowed. | [optional] [default to False]
**canaddquestion** | **bool** | Whether the user has the capability mod/forum:addquestion allowed. | [optional] [default to False]
**canallowforcesubscribe** | **bool** | Whether the user has the capability mod/forum:allowforcesubscribe allowed. | [optional] [default to False]
**cancanmailnow** | **bool** | Whether the user has the capability mod/forum:canmailnow allowed. | [optional] [default to False]
**cancanoverridecutoff** | **bool** | Whether the user has the capability mod/forum:canoverridecutoff allowed. | [optional] [default to False]
**cancanoverridediscussionlock** | **bool** | Whether the user has the capability mod/forum:canoverridediscussionlock allowed. | [optional] [default to False]
**cancanposttomygroups** | **bool** | Whether the user has the capability mod/forum:canposttomygroups allowed. | [optional] [default to False]
**cancantogglefavourite** | **bool** | Whether the user has the capability mod/forum:cantogglefavourite allowed. | [optional] [default to False]
**cancreateattachment** | **bool** | Whether the user has the capability mod/forum:createattachment allowed. | [optional] [default to False]
**candeleteanypost** | **bool** | Whether the user has the capability mod/forum:deleteanypost allowed. | [optional] [default to False]
**candeleteownpost** | **bool** | Whether the user has the capability mod/forum:deleteownpost allowed. | [optional] [default to False]
**caneditanypost** | **bool** | Whether the user has the capability mod/forum:editanypost allowed. | [optional] [default to False]
**canexportdiscussion** | **bool** | Whether the user has the capability mod/forum:exportdiscussion allowed. | [optional] [default to False]
**canexportforum** | **bool** | Whether the user has the capability mod/forum:exportforum allowed. | [optional] [default to False]
**canexportownpost** | **bool** | Whether the user has the capability mod/forum:exportownpost allowed. | [optional] [default to False]
**canexportpost** | **bool** | Whether the user has the capability mod/forum:exportpost allowed. | [optional] [default to False]
**cangrade** | **bool** | Whether the user has the capability mod/forum:grade allowed. | [optional] [default to False]
**canmanagesubscriptions** | **bool** | Whether the user has the capability mod/forum:managesubscriptions allowed. | [optional] [default to False]
**canmovediscussions** | **bool** | Whether the user has the capability mod/forum:movediscussions allowed. | [optional] [default to False]
**canpindiscussions** | **bool** | Whether the user has the capability mod/forum:pindiscussions allowed. | [optional] [default to False]
**canpostprivatereply** | **bool** | Whether the user has the capability mod/forum:postprivatereply allowed. | [optional] [default to False]
**canpostwithoutthrottling** | **bool** | Whether the user has the capability mod/forum:postwithoutthrottling allowed. | [optional] [default to False]
**canrate** | **bool** | Whether the user has the capability mod/forum:rate allowed. | [optional] [default to False]
**canreadprivatereplies** | **bool** | Whether the user has the capability mod/forum:readprivatereplies allowed. | [optional] [default to False]
**canreplynews** | **bool** | Whether the user has the capability mod/forum:replynews allowed. | [optional] [default to False]
**canreplypost** | **bool** | Whether the user has the capability mod/forum:replypost allowed. | [optional] [default to False]
**cansplitdiscussions** | **bool** | Whether the user has the capability mod/forum:splitdiscussions allowed. | [optional] [default to False]
**canstartdiscussion** | **bool** | Whether the user has the capability mod/forum:startdiscussion allowed. | [optional] [default to False]
**canviewallratings** | **bool** | Whether the user has the capability mod/forum:viewallratings allowed. | [optional] [default to False]
**canviewanyrating** | **bool** | Whether the user has the capability mod/forum:viewanyrating allowed. | [optional] [default to False]
**canviewdiscussion** | **bool** | Whether the user has the capability mod/forum:viewdiscussion allowed. | [optional] [default to False]
**canviewhiddentimedposts** | **bool** | Whether the user has the capability mod/forum:viewhiddentimedposts allowed. | [optional] [default to False]
**canviewqandawithoutposting** | **bool** | Whether the user has the capability mod/forum:viewqandawithoutposting allowed. | [optional] [default to False]
**canviewrating** | **bool** | Whether the user has the capability mod/forum:viewrating allowed. | [optional] [default to False]
**canviewsubscribers** | **bool** | Whether the user has the capability mod/forum:viewsubscribers allowed. | [optional] [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_forum_access_information200_response import ModForumGetForumAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumAccessInformation200Response from a JSON string
mod_forum_get_forum_access_information200_response_instance = ModForumGetForumAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumAccessInformation200Response.to_json())

# convert the object into a dict
mod_forum_get_forum_access_information200_response_dict = mod_forum_get_forum_access_information200_response_instance.to_dict()
# create an instance of ModForumGetForumAccessInformation200Response from a dict
mod_forum_get_forum_access_information200_response_from_dict = ModForumGetForumAccessInformation200Response.from_dict(mod_forum_get_forum_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


