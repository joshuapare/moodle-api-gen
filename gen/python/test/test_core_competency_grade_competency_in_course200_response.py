# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_grade_competency_in_course200_response import CoreCompetencyGradeCompetencyInCourse200Response

class TestCoreCompetencyGradeCompetencyInCourse200Response(unittest.TestCase):
    """CoreCompetencyGradeCompetencyInCourse200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyGradeCompetencyInCourse200Response:
        """Test CoreCompetencyGradeCompetencyInCourse200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyGradeCompetencyInCourse200Response`
        """
        model = CoreCompetencyGradeCompetencyInCourse200Response()
        if include_optional:
            return CoreCompetencyGradeCompetencyInCourse200Response(
                action = 56,
                actionuser = openapi_client.models.core_competency_grade_competency_200_response_actionuser.core_competency_grade_competency_200_response_actionuser(
                    department = '', 
                    email = '', 
                    fullname = '', 
                    id = 56, 
                    identity = '', 
                    idnumber = '', 
                    institution = '', 
                    phone1 = '', 
                    phone2 = '', 
                    profileimageurl = '', 
                    profileimageurlsmall = '', 
                    profileurl = '', ),
                actionuserid = 56,
                candelete = True,
                contextid = 56,
                desca = '',
                desccomponent = '',
                descidentifier = '',
                description = '',
                grade = 56,
                gradename = '',
                id = 56,
                note = '',
                timecreated = 56,
                timemodified = 56,
                url = '',
                usercompetencyid = 56,
                userdate = '',
                usermodified = 56
            )
        else:
            return CoreCompetencyGradeCompetencyInCourse200Response(
                action = 56,
                actionuserid = 56,
                candelete = True,
                contextid = 56,
                desca = '',
                desccomponent = '',
                descidentifier = '',
                description = '',
                grade = 56,
                gradename = '',
                id = 56,
                note = '',
                timecreated = 56,
                timemodified = 56,
                url = '',
                usercompetencyid = 56,
                userdate = '',
                usermodified = 56,
        )
        """

    def testCoreCompetencyGradeCompetencyInCourse200Response(self):
        """Test CoreCompetencyGradeCompetencyInCourse200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
