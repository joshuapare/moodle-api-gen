/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModSurveyViewSurveyRequest
    /// </summary>
    [DataContract(Name = "mod_survey_view_survey_request")]
    public partial class ModSurveyViewSurveyRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModSurveyViewSurveyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModSurveyViewSurveyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModSurveyViewSurveyRequest" /> class.
        /// </summary>
        /// <param name="surveyid">survey instance id (required).</param>
        public ModSurveyViewSurveyRequest(int surveyid = default(int))
        {
            this.Surveyid = surveyid;
        }

        /// <summary>
        /// survey instance id
        /// </summary>
        /// <value>survey instance id</value>
        [DataMember(Name = "surveyid", IsRequired = true, EmitDefaultValue = true)]
        public int Surveyid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModSurveyViewSurveyRequest {\n");
            sb.Append("  Surveyid: ").Append(Surveyid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
