# ModWikiGetSubwikis200ResponseSubwikisInner

Subwikis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canedit** | **bool** | True if user can edit the subwiki. | [optional] [default to False]
**groupid** | **str** | Group ID. | [optional] [default to 'null']
**id** | **int** | Subwiki ID. | [optional] [default to null]
**userid** | **int** | User ID. | [optional] [default to null]
**wikiid** | **int** | Wiki ID. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_wiki_get_subwikis200_response_subwikis_inner import ModWikiGetSubwikis200ResponseSubwikisInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModWikiGetSubwikis200ResponseSubwikisInner from a JSON string
mod_wiki_get_subwikis200_response_subwikis_inner_instance = ModWikiGetSubwikis200ResponseSubwikisInner.from_json(json)
# print the JSON string representation of the object
print(ModWikiGetSubwikis200ResponseSubwikisInner.to_json())

# convert the object into a dict
mod_wiki_get_subwikis200_response_subwikis_inner_dict = mod_wiki_get_subwikis200_response_subwikis_inner_instance.to_dict()
# create an instance of ModWikiGetSubwikis200ResponseSubwikisInner from a dict
mod_wiki_get_subwikis200_response_subwikis_inner_from_dict = ModWikiGetSubwikis200ResponseSubwikisInner.from_dict(mod_wiki_get_subwikis200_response_subwikis_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


