# ModDataGetDatabasesByCourses200ResponseDatabasesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addtemplate** | **str** | addtemplate field | [optional] [default to 'null']
**approval** | **bool** | approval field | [optional] [default to False]
**asearchtemplate** | **str** | asearchtemplate field | [optional] [default to 'null']
**assessed** | **int** | assessed field | [optional] [default to null]
**assesstimefinish** | **int** | assesstimefinish field | [optional] [default to null]
**assesstimestart** | **int** | assesstimestart field | [optional] [default to null]
**comments** | **bool** | comments enabled | [optional] [default to False]
**course** | **int** | Course id | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional] [default to null]
**csstemplate** | **str** | csstemplate field | [optional] [default to 'null']
**defaultsort** | **int** | defaultsort field | [optional] [default to null]
**defaultsortdir** | **int** | defaultsortdir field | [optional] [default to null]
**editany** | **bool** | editany field (not used any more) | [optional] [default to False]
**id** | **int** | Database id | [optional] [default to null]
**intro** | **str** | The Database intro | [optional] [default to 'null']
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**jstemplate** | **str** | jstemplate field | [optional] [default to 'null']
**lang** | **str** | Forced activity language | [optional] 
**listtemplate** | **str** | listtemplate field | [optional] [default to 'null']
**listtemplatefooter** | **str** | listtemplatefooter field | [optional] [default to 'null']
**listtemplateheader** | **str** | listtemplateheader field | [optional] [default to 'null']
**manageapproved** | **bool** | manageapproved field | [optional] [default to False]
**maxentries** | **int** | maxentries field | [optional] [default to null]
**name** | **str** | Database name | [optional] [default to 'null']
**notification** | **int** | notification field (not used any more) | [optional] [default to null]
**requiredentries** | **int** | requiredentries field | [optional] [default to null]
**requiredentriestoview** | **int** | requiredentriestoview field | [optional] [default to null]
**rssarticles** | **int** | rssarticles field | [optional] [default to null]
**rsstemplate** | **str** | rsstemplate field | [optional] [default to 'null']
**rsstitletemplate** | **str** | rsstitletemplate field | [optional] [default to 'null']
**scale** | **int** | scale field | [optional] [default to null]
**singletemplate** | **str** | singletemplate field | [optional] [default to 'null']
**timeavailablefrom** | **int** | timeavailablefrom field | [optional] [default to null]
**timeavailableto** | **int** | timeavailableto field | [optional] [default to null]
**timemodified** | **int** | Time modified | [optional] [default to null]
**timeviewfrom** | **int** | timeviewfrom field | [optional] [default to null]
**timeviewto** | **int** | timeviewto field | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_data_get_databases_by_courses200_response_databases_inner import ModDataGetDatabasesByCourses200ResponseDatabasesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetDatabasesByCourses200ResponseDatabasesInner from a JSON string
mod_data_get_databases_by_courses200_response_databases_inner_instance = ModDataGetDatabasesByCourses200ResponseDatabasesInner.from_json(json)
# print the JSON string representation of the object
print(ModDataGetDatabasesByCourses200ResponseDatabasesInner.to_json())

# convert the object into a dict
mod_data_get_databases_by_courses200_response_databases_inner_dict = mod_data_get_databases_by_courses200_response_databases_inner_instance.to_dict()
# create an instance of ModDataGetDatabasesByCourses200ResponseDatabasesInner from a dict
mod_data_get_databases_by_courses200_response_databases_inner_from_dict = ModDataGetDatabasesByCourses200ResponseDatabasesInner.from_dict(mod_data_get_databases_by_courses200_response_databases_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


