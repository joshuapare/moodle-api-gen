# CoreCompetencyCreatePlan200ResponseCommentarea


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autostart** | **bool** | autostart | [default to False]
**canpost** | **bool** | canpost | [default to False]
**canpostorhascomments** | **bool** | canpostorhascomments | [default to False]
**canview** | **bool** | canview | [default to False]
**cid** | **str** | cid | [default to 'null']
**collapsediconkey** | **str** | collapsediconkey | [default to 'null']
**commentarea** | **str** | commentarea | [default to 'null']
**component** | **str** | component | 
**contextid** | **int** | contextid | 
**count** | **int** | count | [default to null]
**courseid** | **int** | courseid | 
**displaycancel** | **bool** | displaycancel | [default to False]
**displaytotalcount** | **bool** | displaytotalcount | [default to False]
**fullwidth** | **bool** | fullwidth | [default to False]
**itemid** | **int** | itemid | [default to null]
**linktext** | **str** | linktext | [default to 'null']
**notoggle** | **bool** | notoggle | [default to False]
**template** | **str** | template | [default to 'null']

## Example

```python
from openapi_client.models.core_competency_create_plan200_response_commentarea import CoreCompetencyCreatePlan200ResponseCommentarea

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlan200ResponseCommentarea from a JSON string
core_competency_create_plan200_response_commentarea_instance = CoreCompetencyCreatePlan200ResponseCommentarea.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlan200ResponseCommentarea.to_json())

# convert the object into a dict
core_competency_create_plan200_response_commentarea_dict = core_competency_create_plan200_response_commentarea_instance.to_dict()
# create an instance of CoreCompetencyCreatePlan200ResponseCommentarea from a dict
core_competency_create_plan200_response_commentarea_from_dict = CoreCompetencyCreatePlan200ResponseCommentarea.from_dict(core_competency_create_plan200_response_commentarea_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


