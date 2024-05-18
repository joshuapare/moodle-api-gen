# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_update_grades_request import CoreGradesUpdateGradesRequest

class TestCoreGradesUpdateGradesRequest(unittest.TestCase):
    """CoreGradesUpdateGradesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesUpdateGradesRequest:
        """Test CoreGradesUpdateGradesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesUpdateGradesRequest`
        """
        model = CoreGradesUpdateGradesRequest()
        if include_optional:
            return CoreGradesUpdateGradesRequest(
                activityid = 56,
                component = 'null',
                courseid = 56,
                grades = [
                    openapi_client.models.core_grades_update_grades_request_grades_inner.core_grades_update_grades_request_grades_inner(
                        grade = 1.337, 
                        str_feedback = 'null', 
                        studentid = 56, )
                    ],
                itemdetails = openapi_client.models.core_grades_update_grades_request_itemdetails.core_grades_update_grades_request_itemdetails(
                    deleted = True, 
                    grademax = 1.337, 
                    grademin = 1.337, 
                    gradetype = 56, 
                    hidden = True, 
                    idnumber = 56, 
                    itemname = 'null', 
                    multfactor = 1.337, 
                    plusfactor = 1.337, 
                    scaleid = 56, ),
                itemnumber = 56,
                source = 'null'
            )
        else:
            return CoreGradesUpdateGradesRequest(
                activityid = 56,
                component = 'null',
                courseid = 56,
                itemnumber = 56,
                source = 'null',
        )
        """

    def testCoreGradesUpdateGradesRequest(self):
        """Test CoreGradesUpdateGradesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()