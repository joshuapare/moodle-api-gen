# GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Averageformatted** | Pointer to **string** | Grade average | [optional] [default to "null"]
**Categoryid** | Pointer to **int32** | Grade item category id | [optional] [default to null]
**Cmid** | Pointer to **int32** | Course module id (if type mod) | [optional] [default to null]
**Feedback** | Pointer to **string** | Grade feedback | [optional] [default to "null"]
**Feedbackformat** | Pointer to **int32** | feedback format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Gradedategraded** | Pointer to **int32** | Grade graded date | [optional] [default to null]
**Gradedatesubmitted** | Pointer to **int32** | Grade submit date | [optional] [default to null]
**Gradeformatted** | Pointer to **string** | The grade formatted | [optional] [default to "null"]
**Gradehiddenbydate** | Pointer to **bool** | Grade hidden by date? | [optional] [default to null]
**Gradeishidden** | Pointer to **bool** | Grade is hidden? | [optional] [default to null]
**Gradeislocked** | Pointer to **bool** | Grade is locked? | [optional] [default to null]
**Gradeisoverridden** | Pointer to **bool** | Grade overridden? | [optional] [default to null]
**Grademax** | Pointer to **float32** | Grade max | [optional] [default to null]
**Grademin** | Pointer to **float32** | Grade min | [optional] [default to null]
**Gradeneedsupdate** | Pointer to **bool** | Grade needs update? | [optional] [default to null]
**Graderaw** | Pointer to **float32** | Grade raw | [optional] [default to null]
**Id** | Pointer to **int32** | Grade item id | [optional] [default to null]
**Idnumber** | Pointer to **string** | Grade item idnumber | [optional] [default to "null"]
**Iteminstance** | Pointer to **int32** | Grade item instance | [optional] [default to null]
**Itemmodule** | Pointer to **string** | Grade item module | [optional] [default to "null"]
**Itemname** | Pointer to **string** | Grade item name | [optional] [default to "null"]
**Itemnumber** | Pointer to **int32** | Grade item item number | [optional] [default to null]
**Itemtype** | Pointer to **string** | Grade item type | [optional] [default to "null"]
**Lettergradeformatted** | Pointer to **string** | Letter grade | [optional] [default to "null"]
**Locked** | Pointer to **bool** | Grade item for user locked? | [optional] [default to null]
**Numusers** | Pointer to **int32** | Num users in course | [optional] [default to null]
**Outcomeid** | Pointer to **int32** | Outcome id | [optional] [default to null]
**Percentageformatted** | Pointer to **string** | Percentage | [optional] [default to "null"]
**Rangeformatted** | Pointer to **string** | Range formatted | [optional] [default to "null"]
**Rank** | Pointer to **int32** | Rank in the course | [optional] [default to null]
**Scaleid** | Pointer to **int32** | Scale id | [optional] [default to null]
**Status** | Pointer to **string** | Status | [optional] [default to "null"]
**Weightformatted** | Pointer to **string** | Weight | [optional] [default to "null"]
**Weightraw** | Pointer to **float32** | Weight raw | [optional] [default to null]

## Methods

### NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner

`func NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner() *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner`

NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner instantiates a new GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInnerWithDefaults

`func NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInnerWithDefaults() *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner`

NewGradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInnerWithDefaults instantiates a new GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAverageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetAverageformatted() string`

GetAverageformatted returns the Averageformatted field if non-nil, zero value otherwise.

### GetAverageformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetAverageformattedOk() (*string, bool)`

GetAverageformattedOk returns a tuple with the Averageformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAverageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetAverageformatted(v string)`

SetAverageformatted sets Averageformatted field to given value.

### HasAverageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasAverageformatted() bool`

HasAverageformatted returns a boolean if a field has been set.

### GetCategoryid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCmid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetCmid(v int32)`

SetCmid sets Cmid field to given value.

### HasCmid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasCmid() bool`

HasCmid returns a boolean if a field has been set.

### GetFeedback

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetFeedback() string`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetFeedbackOk() (*string, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetFeedback(v string)`

SetFeedback sets Feedback field to given value.

### HasFeedback

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasFeedback() bool`

HasFeedback returns a boolean if a field has been set.

### GetFeedbackformat

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetFeedbackformat() int32`

GetFeedbackformat returns the Feedbackformat field if non-nil, zero value otherwise.

### GetFeedbackformatOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetFeedbackformatOk() (*int32, bool)`

GetFeedbackformatOk returns a tuple with the Feedbackformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackformat

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetFeedbackformat(v int32)`

SetFeedbackformat sets Feedbackformat field to given value.

### HasFeedbackformat

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasFeedbackformat() bool`

HasFeedbackformat returns a boolean if a field has been set.

### GetGradedategraded

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradedategraded() int32`

GetGradedategraded returns the Gradedategraded field if non-nil, zero value otherwise.

### GetGradedategradedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradedategradedOk() (*int32, bool)`

GetGradedategradedOk returns a tuple with the Gradedategraded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedategraded

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradedategraded(v int32)`

SetGradedategraded sets Gradedategraded field to given value.

### HasGradedategraded

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradedategraded() bool`

HasGradedategraded returns a boolean if a field has been set.

### GetGradedatesubmitted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradedatesubmitted() int32`

GetGradedatesubmitted returns the Gradedatesubmitted field if non-nil, zero value otherwise.

### GetGradedatesubmittedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradedatesubmittedOk() (*int32, bool)`

GetGradedatesubmittedOk returns a tuple with the Gradedatesubmitted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedatesubmitted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradedatesubmitted(v int32)`

SetGradedatesubmitted sets Gradedatesubmitted field to given value.

### HasGradedatesubmitted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradedatesubmitted() bool`

HasGradedatesubmitted returns a boolean if a field has been set.

### GetGradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeformatted() string`

GetGradeformatted returns the Gradeformatted field if non-nil, zero value otherwise.

### GetGradeformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeformattedOk() (*string, bool)`

GetGradeformattedOk returns a tuple with the Gradeformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradeformatted(v string)`

SetGradeformatted sets Gradeformatted field to given value.

### HasGradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradeformatted() bool`

HasGradeformatted returns a boolean if a field has been set.

### GetGradehiddenbydate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradehiddenbydate() bool`

GetGradehiddenbydate returns the Gradehiddenbydate field if non-nil, zero value otherwise.

### GetGradehiddenbydateOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradehiddenbydateOk() (*bool, bool)`

GetGradehiddenbydateOk returns a tuple with the Gradehiddenbydate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradehiddenbydate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradehiddenbydate(v bool)`

SetGradehiddenbydate sets Gradehiddenbydate field to given value.

### HasGradehiddenbydate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradehiddenbydate() bool`

HasGradehiddenbydate returns a boolean if a field has been set.

### GetGradeishidden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeishidden() bool`

GetGradeishidden returns the Gradeishidden field if non-nil, zero value otherwise.

### GetGradeishiddenOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeishiddenOk() (*bool, bool)`

GetGradeishiddenOk returns a tuple with the Gradeishidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeishidden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradeishidden(v bool)`

SetGradeishidden sets Gradeishidden field to given value.

### HasGradeishidden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradeishidden() bool`

HasGradeishidden returns a boolean if a field has been set.

### GetGradeislocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeislocked() bool`

GetGradeislocked returns the Gradeislocked field if non-nil, zero value otherwise.

### GetGradeislockedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeislockedOk() (*bool, bool)`

GetGradeislockedOk returns a tuple with the Gradeislocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeislocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradeislocked(v bool)`

SetGradeislocked sets Gradeislocked field to given value.

### HasGradeislocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradeislocked() bool`

HasGradeislocked returns a boolean if a field has been set.

### GetGradeisoverridden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeisoverridden() bool`

GetGradeisoverridden returns the Gradeisoverridden field if non-nil, zero value otherwise.

### GetGradeisoverriddenOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeisoverriddenOk() (*bool, bool)`

GetGradeisoverriddenOk returns a tuple with the Gradeisoverridden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeisoverridden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradeisoverridden(v bool)`

SetGradeisoverridden sets Gradeisoverridden field to given value.

### HasGradeisoverridden

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradeisoverridden() bool`

HasGradeisoverridden returns a boolean if a field has been set.

### GetGrademax

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGrademax() float32`

GetGrademax returns the Grademax field if non-nil, zero value otherwise.

### GetGrademaxOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGrademaxOk() (*float32, bool)`

GetGrademaxOk returns a tuple with the Grademax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademax

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGrademax(v float32)`

SetGrademax sets Grademax field to given value.

### HasGrademax

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGrademax() bool`

HasGrademax returns a boolean if a field has been set.

### GetGrademin

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGrademin() float32`

GetGrademin returns the Grademin field if non-nil, zero value otherwise.

### GetGrademinOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGrademinOk() (*float32, bool)`

GetGrademinOk returns a tuple with the Grademin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademin

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGrademin(v float32)`

SetGrademin sets Grademin field to given value.

### HasGrademin

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGrademin() bool`

HasGrademin returns a boolean if a field has been set.

### GetGradeneedsupdate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeneedsupdate() bool`

GetGradeneedsupdate returns the Gradeneedsupdate field if non-nil, zero value otherwise.

### GetGradeneedsupdateOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGradeneedsupdateOk() (*bool, bool)`

GetGradeneedsupdateOk returns a tuple with the Gradeneedsupdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradeneedsupdate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGradeneedsupdate(v bool)`

SetGradeneedsupdate sets Gradeneedsupdate field to given value.

### HasGradeneedsupdate

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGradeneedsupdate() bool`

HasGradeneedsupdate returns a boolean if a field has been set.

### GetGraderaw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGraderaw() float32`

GetGraderaw returns the Graderaw field if non-nil, zero value otherwise.

### GetGraderawOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetGraderawOk() (*float32, bool)`

GetGraderawOk returns a tuple with the Graderaw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraderaw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetGraderaw(v float32)`

SetGraderaw sets Graderaw field to given value.

### HasGraderaw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasGraderaw() bool`

HasGraderaw returns a boolean if a field has been set.

### GetId

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIdnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetIteminstance

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetIteminstance() int32`

GetIteminstance returns the Iteminstance field if non-nil, zero value otherwise.

### GetIteminstanceOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetIteminstanceOk() (*int32, bool)`

GetIteminstanceOk returns a tuple with the Iteminstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIteminstance

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetIteminstance(v int32)`

SetIteminstance sets Iteminstance field to given value.

### HasIteminstance

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasIteminstance() bool`

HasIteminstance returns a boolean if a field has been set.

### GetItemmodule

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemmodule() string`

GetItemmodule returns the Itemmodule field if non-nil, zero value otherwise.

### GetItemmoduleOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemmoduleOk() (*string, bool)`

GetItemmoduleOk returns a tuple with the Itemmodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemmodule

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetItemmodule(v string)`

SetItemmodule sets Itemmodule field to given value.

### HasItemmodule

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasItemmodule() bool`

HasItemmodule returns a boolean if a field has been set.

### GetItemname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemname() string`

GetItemname returns the Itemname field if non-nil, zero value otherwise.

### GetItemnameOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemnameOk() (*string, bool)`

GetItemnameOk returns a tuple with the Itemname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetItemname(v string)`

SetItemname sets Itemname field to given value.

### HasItemname

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasItemname() bool`

HasItemname returns a boolean if a field has been set.

### GetItemnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemnumber() int32`

GetItemnumber returns the Itemnumber field if non-nil, zero value otherwise.

### GetItemnumberOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemnumberOk() (*int32, bool)`

GetItemnumberOk returns a tuple with the Itemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetItemnumber(v int32)`

SetItemnumber sets Itemnumber field to given value.

### HasItemnumber

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasItemnumber() bool`

HasItemnumber returns a boolean if a field has been set.

### GetItemtype

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemtype() string`

GetItemtype returns the Itemtype field if non-nil, zero value otherwise.

### GetItemtypeOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetItemtypeOk() (*string, bool)`

GetItemtypeOk returns a tuple with the Itemtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemtype

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetItemtype(v string)`

SetItemtype sets Itemtype field to given value.

### HasItemtype

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasItemtype() bool`

HasItemtype returns a boolean if a field has been set.

### GetLettergradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetLettergradeformatted() string`

GetLettergradeformatted returns the Lettergradeformatted field if non-nil, zero value otherwise.

### GetLettergradeformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetLettergradeformattedOk() (*string, bool)`

GetLettergradeformattedOk returns a tuple with the Lettergradeformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLettergradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetLettergradeformatted(v string)`

SetLettergradeformatted sets Lettergradeformatted field to given value.

### HasLettergradeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasLettergradeformatted() bool`

HasLettergradeformatted returns a boolean if a field has been set.

### GetLocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetLocked() bool`

GetLocked returns the Locked field if non-nil, zero value otherwise.

### GetLockedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetLockedOk() (*bool, bool)`

GetLockedOk returns a tuple with the Locked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetLocked(v bool)`

SetLocked sets Locked field to given value.

### HasLocked

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasLocked() bool`

HasLocked returns a boolean if a field has been set.

### GetNumusers

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetNumusers() int32`

GetNumusers returns the Numusers field if non-nil, zero value otherwise.

### GetNumusersOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetNumusersOk() (*int32, bool)`

GetNumusersOk returns a tuple with the Numusers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumusers

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetNumusers(v int32)`

SetNumusers sets Numusers field to given value.

### HasNumusers

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasNumusers() bool`

HasNumusers returns a boolean if a field has been set.

### GetOutcomeid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetOutcomeid() int32`

GetOutcomeid returns the Outcomeid field if non-nil, zero value otherwise.

### GetOutcomeidOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetOutcomeidOk() (*int32, bool)`

GetOutcomeidOk returns a tuple with the Outcomeid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutcomeid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetOutcomeid(v int32)`

SetOutcomeid sets Outcomeid field to given value.

### HasOutcomeid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasOutcomeid() bool`

HasOutcomeid returns a boolean if a field has been set.

### GetPercentageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetPercentageformatted() string`

GetPercentageformatted returns the Percentageformatted field if non-nil, zero value otherwise.

### GetPercentageformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetPercentageformattedOk() (*string, bool)`

GetPercentageformattedOk returns a tuple with the Percentageformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetPercentageformatted(v string)`

SetPercentageformatted sets Percentageformatted field to given value.

### HasPercentageformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasPercentageformatted() bool`

HasPercentageformatted returns a boolean if a field has been set.

### GetRangeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetRangeformatted() string`

GetRangeformatted returns the Rangeformatted field if non-nil, zero value otherwise.

### GetRangeformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetRangeformattedOk() (*string, bool)`

GetRangeformattedOk returns a tuple with the Rangeformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRangeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetRangeformatted(v string)`

SetRangeformatted sets Rangeformatted field to given value.

### HasRangeformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasRangeformatted() bool`

HasRangeformatted returns a boolean if a field has been set.

### GetRank

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetRank() int32`

GetRank returns the Rank field if non-nil, zero value otherwise.

### GetRankOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetRankOk() (*int32, bool)`

GetRankOk returns a tuple with the Rank field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRank

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetRank(v int32)`

SetRank sets Rank field to given value.

### HasRank

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasRank() bool`

HasRank returns a boolean if a field has been set.

### GetScaleid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.

### HasScaleid

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasScaleid() bool`

HasScaleid returns a boolean if a field has been set.

### GetStatus

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetWeightformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetWeightformatted() string`

GetWeightformatted returns the Weightformatted field if non-nil, zero value otherwise.

### GetWeightformattedOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetWeightformattedOk() (*string, bool)`

GetWeightformattedOk returns a tuple with the Weightformatted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetWeightformatted(v string)`

SetWeightformatted sets Weightformatted field to given value.

### HasWeightformatted

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasWeightformatted() bool`

HasWeightformatted returns a boolean if a field has been set.

### GetWeightraw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetWeightraw() float32`

GetWeightraw returns the Weightraw field if non-nil, zero value otherwise.

### GetWeightrawOk

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) GetWeightrawOk() (*float32, bool)`

GetWeightrawOk returns a tuple with the Weightraw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightraw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) SetWeightraw(v float32)`

SetWeightraw sets Weightraw field to given value.

### HasWeightraw

`func (o *GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner) HasWeightraw() bool`

HasWeightraw returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


