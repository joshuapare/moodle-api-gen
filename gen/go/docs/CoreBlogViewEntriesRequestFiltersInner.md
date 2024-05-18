# CoreBlogViewEntriesRequestFiltersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The expected keys (value format) are:                                 tag      PARAM_NOTAGS blog tag                                 tagid    PARAM_INT    blog tag id                                 userid   PARAM_INT    blog author (userid)                                 cmid     PARAM_INT    course module id                                 entryid  PARAM_INT    entry id                                 groupid  PARAM_INT    group id                                 courseid PARAM_INT    course id                                 search   PARAM_RAW    search term                                  | [optional] [default to "null"]
**Value** | Pointer to **string** | The value of the filter. | [optional] 

## Methods

### NewCoreBlogViewEntriesRequestFiltersInner

`func NewCoreBlogViewEntriesRequestFiltersInner() *CoreBlogViewEntriesRequestFiltersInner`

NewCoreBlogViewEntriesRequestFiltersInner instantiates a new CoreBlogViewEntriesRequestFiltersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlogViewEntriesRequestFiltersInnerWithDefaults

`func NewCoreBlogViewEntriesRequestFiltersInnerWithDefaults() *CoreBlogViewEntriesRequestFiltersInner`

NewCoreBlogViewEntriesRequestFiltersInnerWithDefaults instantiates a new CoreBlogViewEntriesRequestFiltersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreBlogViewEntriesRequestFiltersInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreBlogViewEntriesRequestFiltersInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreBlogViewEntriesRequestFiltersInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreBlogViewEntriesRequestFiltersInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *CoreBlogViewEntriesRequestFiltersInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreBlogViewEntriesRequestFiltersInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreBlogViewEntriesRequestFiltersInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreBlogViewEntriesRequestFiltersInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


