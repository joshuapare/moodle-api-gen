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
    /// ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner
    /// </summary>
    [DataContract(Name = "mod_quiz_get_attempt_data_200_response_questions_inner_responsefileareas_inner")]
    public partial class ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner" /> class.
        /// </summary>
        /// <param name="area">File area name (default to &quot;null&quot;).</param>
        /// <param name="files">files.</param>
        public ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner(string area = @"null", List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> files = default(List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>))
        {
            // use default value if no "area" provided
            this.Area = area ?? @"null";
            this.Files = files;
        }

        /// <summary>
        /// File area name
        /// </summary>
        /// <value>File area name</value>
        [DataMember(Name = "area", EmitDefaultValue = false)]
        public string Area { get; set; }

        /// <summary>
        /// Gets or Sets Files
        /// </summary>
        [DataMember(Name = "files", EmitDefaultValue = false)]
        public List<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner> Files { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Files: ").Append(Files).Append("\n");
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