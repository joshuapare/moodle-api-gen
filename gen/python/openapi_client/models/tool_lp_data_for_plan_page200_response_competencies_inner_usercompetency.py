# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_competency_grade_competency200_response_actionuser import CoreCompetencyGradeCompetency200ResponseActionuser
from typing import Optional, Set
from typing_extensions import Self

class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency(BaseModel):
    """
    ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency
    """ # noqa: E501
    canrequestreview: StrictBool = Field(description="canrequestreview")
    canreview: StrictBool = Field(description="canreview")
    competencyid: StrictInt = Field(description="competencyid")
    grade: StrictInt = Field(description="grade")
    gradename: StrictStr = Field(description="gradename")
    id: StrictInt = Field(description="id")
    iscancelreviewrequestallowed: StrictBool = Field(description="iscancelreviewrequestallowed")
    isrequestreviewallowed: StrictBool = Field(description="isrequestreviewallowed")
    isstartreviewallowed: StrictBool = Field(description="isstartreviewallowed")
    isstatusidle: StrictBool = Field(description="isstatusidle")
    isstatusinreview: StrictBool = Field(description="isstatusinreview")
    isstatuswaitingforreview: StrictBool = Field(description="isstatuswaitingforreview")
    isstopreviewallowed: StrictBool = Field(description="isstopreviewallowed")
    proficiency: StrictBool = Field(description="proficiency")
    proficiencyname: StrictStr = Field(description="proficiencyname")
    reviewer: Optional[CoreCompetencyGradeCompetency200ResponseActionuser] = None
    reviewerid: StrictInt = Field(description="reviewerid")
    status: StrictInt = Field(description="status")
    statusname: StrictStr = Field(description="statusname")
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    url: StrictStr = Field(description="url")
    userid: StrictInt = Field(description="userid")
    usermodified: StrictInt = Field(description="usermodified")
    __properties: ClassVar[List[str]] = ["canrequestreview", "canreview", "competencyid", "grade", "gradename", "id", "iscancelreviewrequestallowed", "isrequestreviewallowed", "isstartreviewallowed", "isstatusidle", "isstatusinreview", "isstatuswaitingforreview", "isstopreviewallowed", "proficiency", "proficiencyname", "reviewer", "reviewerid", "status", "statusname", "timecreated", "timemodified", "url", "userid", "usermodified"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of reviewer
        if self.reviewer:
            _dict['reviewer'] = self.reviewer.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "canrequestreview": obj.get("canrequestreview"),
            "canreview": obj.get("canreview"),
            "competencyid": obj.get("competencyid"),
            "grade": obj.get("grade"),
            "gradename": obj.get("gradename"),
            "id": obj.get("id") if obj.get("id") is not None else 0,
            "iscancelreviewrequestallowed": obj.get("iscancelreviewrequestallowed"),
            "isrequestreviewallowed": obj.get("isrequestreviewallowed"),
            "isstartreviewallowed": obj.get("isstartreviewallowed"),
            "isstatusidle": obj.get("isstatusidle") if obj.get("isstatusidle") is not None else False,
            "isstatusinreview": obj.get("isstatusinreview") if obj.get("isstatusinreview") is not None else False,
            "isstatuswaitingforreview": obj.get("isstatuswaitingforreview") if obj.get("isstatuswaitingforreview") is not None else False,
            "isstopreviewallowed": obj.get("isstopreviewallowed"),
            "proficiency": obj.get("proficiency"),
            "proficiencyname": obj.get("proficiencyname"),
            "reviewer": CoreCompetencyGradeCompetency200ResponseActionuser.from_dict(obj["reviewer"]) if obj.get("reviewer") is not None else None,
            "reviewerid": obj.get("reviewerid"),
            "status": obj.get("status") if obj.get("status") is not None else 0,
            "statusname": obj.get("statusname"),
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "url": obj.get("url"),
            "userid": obj.get("userid"),
            "usermodified": obj.get("usermodified") if obj.get("usermodified") is not None else 0
        })
        return _obj


