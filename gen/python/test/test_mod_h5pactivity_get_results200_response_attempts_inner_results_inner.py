# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_h5pactivity_get_results200_response_attempts_inner_results_inner import ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner

class TestModH5pactivityGetResults200ResponseAttemptsInnerResultsInner(unittest.TestCase):
    """ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner:
        """Test ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner`
        """
        model = ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner()
        if include_optional:
            return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner(
                answerlabel = 'null',
                attemptid = 56,
                completion = 56,
                content = 'null',
                correctlabel = 'null',
                description = 'null',
                duration = 56,
                id = 56,
                interactiontype = 'null',
                maxscore = 56,
                options = [
                    openapi_client.models.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner(
                        correctanswer = openapi_client.models.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner_correctanswer.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner_correctanswer(
                            answer = 'null', 
                            checked = True, 
                            correct = True, 
                            fail = True, 
                            incorrect = True, 
                            pass = True, 
                            text = True, 
                            unchecked = True, ), 
                        description = 'null', 
                        id = 'null', 
                        useranswer = openapi_client.models.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner_useranswer.mod_h5pactivity_get_results_200_response_attempts_inner_results_inner_options_inner_useranswer(
                            answer = '', 
                            checked = True, 
                            correct = True, 
                            fail = True, 
                            incorrect = True, 
                            pass = True, 
                            text = True, 
                            unchecked = True, ), )
                    ],
                optionslabel = 'null',
                rawscore = 56,
                subcontent = 'null',
                success = 56,
                timecreated = 56,
                track = True
            )
        else:
            return ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner(
        )
        """

    def testModH5pactivityGetResults200ResponseAttemptsInnerResultsInner(self):
        """Test ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()