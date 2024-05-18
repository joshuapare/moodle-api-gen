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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModAssignGetSubmissionStatus200Response
    /// </summary>
    [DataContract(Name = "mod_assign_get_submission_status_200_response")]
    public partial class ModAssignGetSubmissionStatus200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200Response" /> class.
        /// </summary>
        /// <param name="assignmentdata">assignmentdata.</param>
        /// <param name="feedback">feedback.</param>
        /// <param name="gradingsummary">gradingsummary.</param>
        /// <param name="lastattempt">lastattempt.</param>
        /// <param name="previousattempts">previousattempts.</param>
        /// <param name="warnings">warnings.</param>
        public ModAssignGetSubmissionStatus200Response(ModAssignGetSubmissionStatus200ResponseAssignmentdata assignmentdata = default(ModAssignGetSubmissionStatus200ResponseAssignmentdata), ModAssignGetSubmissionStatus200ResponseFeedback feedback = default(ModAssignGetSubmissionStatus200ResponseFeedback), ModAssignGetSubmissionStatus200ResponseGradingsummary gradingsummary = default(ModAssignGetSubmissionStatus200ResponseGradingsummary), ModAssignGetSubmissionStatus200ResponseLastattempt lastattempt = default(ModAssignGetSubmissionStatus200ResponseLastattempt), List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> previousattempts = default(List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Assignmentdata = assignmentdata;
            this.Feedback = feedback;
            this.Gradingsummary = gradingsummary;
            this.Lastattempt = lastattempt;
            this.Previousattempts = previousattempts;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Assignmentdata
        /// </summary>
        [DataMember(Name = "assignmentdata", EmitDefaultValue = false)]
        public ModAssignGetSubmissionStatus200ResponseAssignmentdata Assignmentdata { get; set; }

        /// <summary>
        /// Gets or Sets Feedback
        /// </summary>
        [DataMember(Name = "feedback", EmitDefaultValue = false)]
        public ModAssignGetSubmissionStatus200ResponseFeedback Feedback { get; set; }

        /// <summary>
        /// Gets or Sets Gradingsummary
        /// </summary>
        [DataMember(Name = "gradingsummary", EmitDefaultValue = false)]
        public ModAssignGetSubmissionStatus200ResponseGradingsummary Gradingsummary { get; set; }

        /// <summary>
        /// Gets or Sets Lastattempt
        /// </summary>
        [DataMember(Name = "lastattempt", EmitDefaultValue = false)]
        public ModAssignGetSubmissionStatus200ResponseLastattempt Lastattempt { get; set; }

        /// <summary>
        /// Gets or Sets Previousattempts
        /// </summary>
        [DataMember(Name = "previousattempts", EmitDefaultValue = false)]
        public List<ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner> Previousattempts { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetSubmissionStatus200Response {\n");
            sb.Append("  Assignmentdata: ").Append(Assignmentdata).Append("\n");
            sb.Append("  Feedback: ").Append(Feedback).Append("\n");
            sb.Append("  Gradingsummary: ").Append(Gradingsummary).Append("\n");
            sb.Append("  Lastattempt: ").Append(Lastattempt).Append("\n");
            sb.Append("  Previousattempts: ").Append(Previousattempts).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
