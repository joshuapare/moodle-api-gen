/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using MoodleClient.Client;
using MoodleClient.Api;
// uncomment below to import models
//using MoodleClient.Model;

namespace MoodleClient.Test.Api
{
    /// <summary>
    ///  Class for testing ModFeedbackApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModFeedbackApiTests : IDisposable
    {
        private ModFeedbackApi instance;

        public ModFeedbackApiTests()
        {
            instance = new ModFeedbackApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModFeedbackApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModFeedbackApi
            //Assert.IsType<ModFeedbackApi>(instance);
        }

        /// <summary>
        /// Test ModFeedbackGetAnalysis
        /// </summary>
        [Fact]
        public void ModFeedbackGetAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetAnalysisRequest modFeedbackGetAnalysisRequest = null;
            //var response = instance.ModFeedbackGetAnalysis(modFeedbackGetAnalysisRequest);
            //Assert.IsType<ModFeedbackGetAnalysis200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetCurrentCompletedTmp
        /// </summary>
        [Fact]
        public void ModFeedbackGetCurrentCompletedTmpTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
            //var response = instance.ModFeedbackGetCurrentCompletedTmp(modFeedbackGetCurrentCompletedTmpRequest);
            //Assert.IsType<ModFeedbackGetCurrentCompletedTmp200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetFeedbackAccessInformation
        /// </summary>
        [Fact]
        public void ModFeedbackGetFeedbackAccessInformationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetFeedbackAccessInformationRequest modFeedbackGetFeedbackAccessInformationRequest = null;
            //var response = instance.ModFeedbackGetFeedbackAccessInformation(modFeedbackGetFeedbackAccessInformationRequest);
            //Assert.IsType<ModFeedbackGetFeedbackAccessInformation200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetFeedbacksByCourses
        /// </summary>
        [Fact]
        public void ModFeedbackGetFeedbacksByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = null;
            //var response = instance.ModFeedbackGetFeedbacksByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
            //Assert.IsType<ModFeedbackGetFeedbacksByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetFinishedResponses
        /// </summary>
        [Fact]
        public void ModFeedbackGetFinishedResponsesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = null;
            //var response = instance.ModFeedbackGetFinishedResponses(modFeedbackGetFinishedResponsesRequest);
            //Assert.IsType<ModFeedbackGetFinishedResponses200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetItems
        /// </summary>
        [Fact]
        public void ModFeedbackGetItemsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
            //var response = instance.ModFeedbackGetItems(modFeedbackGetCurrentCompletedTmpRequest);
            //Assert.IsType<ModFeedbackGetItems200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetLastCompleted
        /// </summary>
        [Fact]
        public void ModFeedbackGetLastCompletedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
            //var response = instance.ModFeedbackGetLastCompleted(modFeedbackGetCurrentCompletedTmpRequest);
            //Assert.IsType<ModFeedbackGetLastCompleted200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetNonRespondents
        /// </summary>
        [Fact]
        public void ModFeedbackGetNonRespondentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetNonRespondentsRequest modFeedbackGetNonRespondentsRequest = null;
            //var response = instance.ModFeedbackGetNonRespondents(modFeedbackGetNonRespondentsRequest);
            //Assert.IsType<ModFeedbackGetNonRespondents200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetPageItems
        /// </summary>
        [Fact]
        public void ModFeedbackGetPageItemsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetPageItemsRequest modFeedbackGetPageItemsRequest = null;
            //var response = instance.ModFeedbackGetPageItems(modFeedbackGetPageItemsRequest);
            //Assert.IsType<ModFeedbackGetPageItems200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetResponsesAnalysis
        /// </summary>
        [Fact]
        public void ModFeedbackGetResponsesAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetResponsesAnalysisRequest modFeedbackGetResponsesAnalysisRequest = null;
            //var response = instance.ModFeedbackGetResponsesAnalysis(modFeedbackGetResponsesAnalysisRequest);
            //Assert.IsType<ModFeedbackGetResponsesAnalysis200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackGetUnfinishedResponses
        /// </summary>
        [Fact]
        public void ModFeedbackGetUnfinishedResponsesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = null;
            //var response = instance.ModFeedbackGetUnfinishedResponses(modFeedbackGetFinishedResponsesRequest);
            //Assert.IsType<ModFeedbackGetUnfinishedResponses200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackLaunchFeedback
        /// </summary>
        [Fact]
        public void ModFeedbackLaunchFeedbackTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
            //var response = instance.ModFeedbackLaunchFeedback(modFeedbackGetCurrentCompletedTmpRequest);
            //Assert.IsType<ModFeedbackLaunchFeedback200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackProcessPage
        /// </summary>
        [Fact]
        public void ModFeedbackProcessPageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackProcessPageRequest modFeedbackProcessPageRequest = null;
            //var response = instance.ModFeedbackProcessPage(modFeedbackProcessPageRequest);
            //Assert.IsType<ModFeedbackProcessPage200Response>(response);
        }

        /// <summary>
        /// Test ModFeedbackViewFeedback
        /// </summary>
        [Fact]
        public void ModFeedbackViewFeedbackTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFeedbackViewFeedbackRequest modFeedbackViewFeedbackRequest = null;
            //var response = instance.ModFeedbackViewFeedback(modFeedbackViewFeedbackRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}
