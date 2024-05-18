# ModWikiGetPageForEditing200ResponsePagesection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The contents of the page-section to be edited. | [optional] [default to 'null']
**contentformat** | **str** | Format of the original content of the page. | [optional] [default to 'null']
**version** | **int** | Latest version of the page. | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_wiki_get_page_for_editing200_response_pagesection import ModWikiGetPageForEditing200ResponsePagesection

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetPageForEditing200ResponsePagesection from a JSON string
mod_wiki_get_page_for_editing200_response_pagesection_instance = ModWikiGetPageForEditing200ResponsePagesection.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetPageForEditing200ResponsePagesection.to_json())

# convert the object into a dict
mod_wiki_get_page_for_editing200_response_pagesection_dict = mod_wiki_get_page_for_editing200_response_pagesection_instance.to_dict()
# create an instance of ModWikiGetPageForEditing200ResponsePagesection from a dict
mod_wiki_get_page_for_editing200_response_pagesection_from_dict = ModWikiGetPageForEditing200ResponsePagesection.from_dict(mod_wiki_get_page_for_editing200_response_pagesection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


