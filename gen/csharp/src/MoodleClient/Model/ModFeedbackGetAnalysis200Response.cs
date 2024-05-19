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
    /// ModFeedbackGetAnalysis200Response
    /// </summary>
    [DataContract(Name = "mod_feedback_get_analysis_200_response")]
    public partial class ModFeedbackGetAnalysis200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetAnalysis200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModFeedbackGetAnalysis200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetAnalysis200Response" /> class.
        /// </summary>
        /// <param name="completedcount">Number of completed submissions. (required) (default to null).</param>
        /// <param name="itemscount">Number of items (questions). (required) (default to null).</param>
        /// <param name="itemsdata">itemsdata (required).</param>
        /// <param name="warnings">warnings.</param>
        public ModFeedbackGetAnalysis200Response(int completedcount = null, int itemscount = null, List<ModFeedbackGetAnalysis200ResponseItemsdataInner> itemsdata = default(List<ModFeedbackGetAnalysis200ResponseItemsdataInner>), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Completedcount = completedcount;
            this.Itemscount = itemscount;
            // to ensure "itemsdata" is required (not null)
            if (itemsdata == null)
            {
                throw new ArgumentNullException("itemsdata is a required property for ModFeedbackGetAnalysis200Response and cannot be null");
            }
            this.Itemsdata = itemsdata;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Number of completed submissions.
        /// </summary>
        /// <value>Number of completed submissions.</value>
        [DataMember(Name = "completedcount", IsRequired = true, EmitDefaultValue = true)]
        public int Completedcount { get; set; }

        /// <summary>
        /// Number of items (questions).
        /// </summary>
        /// <value>Number of items (questions).</value>
        [DataMember(Name = "itemscount", IsRequired = true, EmitDefaultValue = true)]
        public int Itemscount { get; set; }

        /// <summary>
        /// Gets or Sets Itemsdata
        /// </summary>
        [DataMember(Name = "itemsdata", IsRequired = true, EmitDefaultValue = true)]
        public List<ModFeedbackGetAnalysis200ResponseItemsdataInner> Itemsdata { get; set; }

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
            sb.Append("class ModFeedbackGetAnalysis200Response {\n");
            sb.Append("  Completedcount: ").Append(Completedcount).Append("\n");
            sb.Append("  Itemscount: ").Append(Itemscount).Append("\n");
            sb.Append("  Itemsdata: ").Append(Itemsdata).Append("\n");
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
