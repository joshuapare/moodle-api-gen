# CoreEnrolSearchUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contextid** | Pointer to **int32** | Context ID | [optional] [default to null]
**Courseid** | **int32** | course id | 
**Page** | **int32** | Page number | 
**Perpage** | **int32** | Number per page | 
**Search** | **string** | query | 
**Searchanywhere** | **bool** | find a match anywhere, or only at the beginning | 

## Methods

### NewCoreEnrolSearchUsersRequest

`func NewCoreEnrolSearchUsersRequest(courseid int32, page int32, perpage int32, search string, searchanywhere bool, ) *CoreEnrolSearchUsersRequest`

NewCoreEnrolSearchUsersRequest instantiates a new CoreEnrolSearchUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreEnrolSearchUsersRequestWithDefaults

`func NewCoreEnrolSearchUsersRequestWithDefaults() *CoreEnrolSearchUsersRequest`

NewCoreEnrolSearchUsersRequestWithDefaults instantiates a new CoreEnrolSearchUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContextid

`func (o *CoreEnrolSearchUsersRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreEnrolSearchUsersRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreEnrolSearchUsersRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreEnrolSearchUsersRequest) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetCourseid

`func (o *CoreEnrolSearchUsersRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreEnrolSearchUsersRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreEnrolSearchUsersRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetPage

`func (o *CoreEnrolSearchUsersRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreEnrolSearchUsersRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreEnrolSearchUsersRequest) SetPage(v int32)`

SetPage sets Page field to given value.


### GetPerpage

`func (o *CoreEnrolSearchUsersRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreEnrolSearchUsersRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreEnrolSearchUsersRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.


### GetSearch

`func (o *CoreEnrolSearchUsersRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *CoreEnrolSearchUsersRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *CoreEnrolSearchUsersRequest) SetSearch(v string)`

SetSearch sets Search field to given value.


### GetSearchanywhere

`func (o *CoreEnrolSearchUsersRequest) GetSearchanywhere() bool`

GetSearchanywhere returns the Searchanywhere field if non-nil, zero value otherwise.

### GetSearchanywhereOk

`func (o *CoreEnrolSearchUsersRequest) GetSearchanywhereOk() (*bool, bool)`

GetSearchanywhereOk returns a tuple with the Searchanywhere field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchanywhere

`func (o *CoreEnrolSearchUsersRequest) SetSearchanywhere(v bool)`

SetSearchanywhere sets Searchanywhere field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


