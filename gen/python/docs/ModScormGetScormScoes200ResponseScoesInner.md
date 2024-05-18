# ModScormGetScormScoes200ResponseScoesInner

SCORM SCO data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extradata** | [**List[ModScormGetScormScoes200ResponseScoesInnerExtradataInner]**](ModScormGetScormScoes200ResponseScoesInnerExtradataInner.md) |  | [optional] 
**id** | **int** | sco id | [optional] 
**identifier** | **str** | identifier | [optional] [default to 'null']
**launch** | **str** | launch file | [optional] [default to 'null']
**manifest** | **str** | manifest id | [optional] [default to 'null']
**organization** | **str** | organization id | [optional] [default to 'null']
**parent** | **str** | parent | [optional] [default to 'null']
**scorm** | **int** | scorm id | [optional] [default to null]
**scormtype** | **str** | scorm type (asset, sco) | [optional] [default to 'null']
**sortorder** | **int** | sort order | [optional] [default to null]
**title** | **str** | sco title | [optional] [default to 'null']

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_scoes200_response_scoes_inner import ModScormGetScormScoes200ResponseScoesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormScoes200ResponseScoesInner from a JSON string
mod_scorm_get_scorm_scoes200_response_scoes_inner_instance = ModScormGetScormScoes200ResponseScoesInner.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormScoes200ResponseScoesInner.to_json())

# convert the object into a dict
mod_scorm_get_scorm_scoes200_response_scoes_inner_dict = mod_scorm_get_scorm_scoes200_response_scoes_inner_instance.to_dict()
# create an instance of ModScormGetScormScoes200ResponseScoesInner from a dict
mod_scorm_get_scorm_scoes200_response_scoes_inner_from_dict = ModScormGetScormScoes200ResponseScoesInner.from_dict(mod_scorm_get_scorm_scoes200_response_scoes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


