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
    /// ModH5pactivityGetResults200Response
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_get_results_200_response")]
    public partial class ModH5pactivityGetResults200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetResults200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModH5pactivityGetResults200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetResults200Response" /> class.
        /// </summary>
        /// <param name="activityid">Activity course module ID (required).</param>
        /// <param name="attempts">attempts (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModH5pactivityGetResults200Response(int activityid = default(int), List<ModH5pactivityGetResults200ResponseAttemptsInner> attempts = default(List<ModH5pactivityGetResults200ResponseAttemptsInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Activityid = activityid;
            // to ensure "attempts" is required (not null)
            if (attempts == null)
            {
                throw new ArgumentNullException("attempts is a required property for ModH5pactivityGetResults200Response and cannot be null");
            }
            this.Attempts = attempts;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Activity course module ID
        /// </summary>
        /// <value>Activity course module ID</value>
        [DataMember(Name = "activityid", IsRequired = true, EmitDefaultValue = true)]
        public int Activityid { get; set; }

        /// <summary>
        /// Gets or Sets Attempts
        /// </summary>
        [DataMember(Name = "attempts", IsRequired = true, EmitDefaultValue = true)]
        public List<ModH5pactivityGetResults200ResponseAttemptsInner> Attempts { get; set; }

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
            sb.Append("class ModH5pactivityGetResults200Response {\n");
            sb.Append("  Activityid: ").Append(Activityid).Append("\n");
            sb.Append("  Attempts: ").Append(Attempts).Append("\n");
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