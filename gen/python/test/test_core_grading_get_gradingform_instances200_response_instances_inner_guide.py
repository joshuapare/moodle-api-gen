# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grading_get_gradingform_instances200_response_instances_inner_guide import CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide

class TestCoreGradingGetGradingformInstances200ResponseInstancesInnerGuide(unittest.TestCase):
    """CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide:
        """Test CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide`
        """
        model = CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide()
        if include_optional:
            return CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide(
                criteria = [
                    openapi_client.models.core_grading_get_gradingform_instances_200_response_instances_inner_guide_criteria_inner.core_grading_get_gradingform_instances_200_response_instances_inner_guide_criteria_inner(
                        criterionid = 56, 
                        id = 56, 
                        levelid = 56, 
                        remark = 'null', 
                        remarkformat = 56, 
                        score = 1.337, )
                    ]
            )
        else:
            return CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide(
        )
        """

    def testCoreGradingGetGradingformInstances200ResponseInstancesInnerGuide(self):
        """Test CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
