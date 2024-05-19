# CoreEnrolGetPotentialUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | course id | 
**Enrolid** | **int32** | enrolment id | [default to null]
**Page** | **int32** | Page number | [default to null]
**Perpage** | **int32** | Number per page | [default to null]
**Search** | **string** | query | [default to "null"]
**Searchanywhere** | **bool** | find a match anywhere, or only at the beginning | [default to null]

## Methods

### NewCoreEnrolGetPotentialUsersRequest

`func NewCoreEnrolGetPotentialUsersRequest(courseid int32, enrolid int32, page int32, perpage int32, search string, searchanywhere bool, ) *CoreEnrolGetPotentialUsersRequest`

NewCoreEnrolGetPotentialUsersRequest instantiates a new CoreEnrolGetPotentialUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreEnrolGetPotentialUsersRequestWithDefaults

`func NewCoreEnrolGetPotentialUsersRequestWithDefaults() *CoreEnrolGetPotentialUsersRequest`

NewCoreEnrolGetPotentialUsersRequestWithDefaults instantiates a new CoreEnrolGetPotentialUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreEnrolGetPotentialUsersRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreEnrolGetPotentialUsersRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetEnrolid

`func (o *CoreEnrolGetPotentialUsersRequest) GetEnrolid() int32`

GetEnrolid returns the Enrolid field if non-nil, zero value otherwise.

### GetEnrolidOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetEnrolidOk() (*int32, bool)`

GetEnrolidOk returns a tuple with the Enrolid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrolid

`func (o *CoreEnrolGetPotentialUsersRequest) SetEnrolid(v int32)`

SetEnrolid sets Enrolid field to given value.


### GetPage

`func (o *CoreEnrolGetPotentialUsersRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreEnrolGetPotentialUsersRequest) SetPage(v int32)`

SetPage sets Page field to given value.


### GetPerpage

`func (o *CoreEnrolGetPotentialUsersRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreEnrolGetPotentialUsersRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.


### GetSearch

`func (o *CoreEnrolGetPotentialUsersRequest) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *CoreEnrolGetPotentialUsersRequest) SetSearch(v string)`

SetSearch sets Search field to given value.


### GetSearchanywhere

`func (o *CoreEnrolGetPotentialUsersRequest) GetSearchanywhere() bool`

GetSearchanywhere returns the Searchanywhere field if non-nil, zero value otherwise.

### GetSearchanywhereOk

`func (o *CoreEnrolGetPotentialUsersRequest) GetSearchanywhereOk() (*bool, bool)`

GetSearchanywhereOk returns a tuple with the Searchanywhere field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchanywhere

`func (o *CoreEnrolGetPotentialUsersRequest) SetSearchanywhere(v bool)`

SetSearchanywhere sets Searchanywhere field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


