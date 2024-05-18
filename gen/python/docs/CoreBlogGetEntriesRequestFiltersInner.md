# CoreBlogGetEntriesRequestFiltersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The expected keys (value format) are:                                 tag      PARAM_NOTAGS blog tag                                 tagid    PARAM_INT    blog tag id                                 userid   PARAM_INT    blog author (userid)                                 cmid    PARAM_INT    course module id                                 entryid  PARAM_INT    entry id                                 groupid  PARAM_INT    group id                                 courseid PARAM_INT    course id                                 search   PARAM_RAW    search term                                  | [optional] [default to 'null']
**value** | **str** | The value of the filter. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_blog_get_entries_request_filters_inner import CoreBlogGetEntriesRequestFiltersInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlogGetEntriesRequestFiltersInner from a JSON string
core_blog_get_entries_request_filters_inner_instance = CoreBlogGetEntriesRequestFiltersInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlogGetEntriesRequestFiltersInner.to_json())

# convert the object into a dict
core_blog_get_entries_request_filters_inner_dict = core_blog_get_entries_request_filters_inner_instance.to_dict()
# create an instance of CoreBlogGetEntriesRequestFiltersInner from a dict
core_blog_get_entries_request_filters_inner_from_dict = CoreBlogGetEntriesRequestFiltersInner.from_dict(core_blog_get_entries_request_filters_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


