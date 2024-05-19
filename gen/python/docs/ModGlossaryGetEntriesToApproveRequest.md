# ModGlossaryGetEntriesToApproveRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID | 
**letter** | **str** | A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | 
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | **object** |  | [optional] 
**order** | **str** | Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; | [optional] [default to 'CONCEPT']
**sort** | **str** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'ASC']

## Example

```python
from openapi_client.models.mod_glossary_get_entries_to_approve_request import ModGlossaryGetEntriesToApproveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModGlossaryGetEntriesToApproveRequest from a JSON string
mod_glossary_get_entries_to_approve_request_instance = ModGlossaryGetEntriesToApproveRequest.from_json(json)
# print the JSON string representation of the object
print(ModGlossaryGetEntriesToApproveRequest.to_json())

# convert the object into a dict
mod_glossary_get_entries_to_approve_request_dict = mod_glossary_get_entries_to_approve_request_instance.to_dict()
# create an instance of ModGlossaryGetEntriesToApproveRequest from a dict
mod_glossary_get_entries_to_approve_request_from_dict = ModGlossaryGetEntriesToApproveRequest.from_dict(mod_glossary_get_entries_to_approve_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


