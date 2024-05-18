# CoreSearchGetRelevantUsersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course id (0 if none) | [default to null]
**Query** | **string** | Query string (full or partial user full name or other details) | [default to "null"]

## Methods

### NewCoreSearchGetRelevantUsersRequest

`func NewCoreSearchGetRelevantUsersRequest(courseid int32, query string, ) *CoreSearchGetRelevantUsersRequest`

NewCoreSearchGetRelevantUsersRequest instantiates a new CoreSearchGetRelevantUsersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetRelevantUsersRequestWithDefaults

`func NewCoreSearchGetRelevantUsersRequestWithDefaults() *CoreSearchGetRelevantUsersRequest`

NewCoreSearchGetRelevantUsersRequestWithDefaults instantiates a new CoreSearchGetRelevantUsersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreSearchGetRelevantUsersRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreSearchGetRelevantUsersRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreSearchGetRelevantUsersRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetQuery

`func (o *CoreSearchGetRelevantUsersRequest) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *CoreSearchGetRelevantUsersRequest) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *CoreSearchGetRelevantUsersRequest) SetQuery(v string)`

SetQuery sets Query field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


