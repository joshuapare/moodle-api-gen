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
    /// ModGlossaryGetEntriesToApproveRequest
    /// </summary>
    [DataContract(Name = "mod_glossary_get_entries_to_approve_request")]
    public partial class ModGlossaryGetEntriesToApproveRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesToApproveRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryGetEntriesToApproveRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesToApproveRequest" /> class.
        /// </summary>
        /// <param name="from">Start returning records from here (default to 0).</param>
        /// <param name="id">Glossary entry ID (required).</param>
        /// <param name="letter">A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. (required).</param>
        /// <param name="limit">Number of records to return (default to 20).</param>
        /// <param name="options">options.</param>
        /// <param name="order">Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39; (default to &quot;CONCEPT&quot;).</param>
        /// <param name="sort">The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; (default to &quot;ASC&quot;).</param>
        public ModGlossaryGetEntriesToApproveRequest(int from = 0, int id = default(int), string letter = default(string), int limit = 20, Object options = default(Object), string order = @"CONCEPT", string sort = @"ASC")
        {
            this.Id = id;
            // to ensure "letter" is required (not null)
            if (letter == null)
            {
                throw new ArgumentNullException("letter is a required property for ModGlossaryGetEntriesToApproveRequest and cannot be null");
            }
            this.Letter = letter;
            this.From = from;
            this.Limit = limit;
            this.Options = options;
            // use default value if no "order" provided
            this.Order = order ?? @"CONCEPT";
            // use default value if no "sort" provided
            this.Sort = sort ?? @"ASC";
        }

        /// <summary>
        /// Start returning records from here
        /// </summary>
        /// <value>Start returning records from here</value>
        [DataMember(Name = "from", EmitDefaultValue = false)]
        public int From { get; set; }

        /// <summary>
        /// Glossary entry ID
        /// </summary>
        /// <value>Glossary entry ID</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;.
        /// </summary>
        /// <value>A letter, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;.</value>
        [DataMember(Name = "letter", IsRequired = true, EmitDefaultValue = true)]
        public string Letter { get; set; }

        /// <summary>
        /// Number of records to return
        /// </summary>
        /// <value>Number of records to return</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public Object Options { get; set; }

        /// <summary>
        /// Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39;
        /// </summary>
        /// <value>Order by: &#39;CONCEPT&#39;, &#39;CREATION&#39; or &#39;UPDATE&#39;</value>
        [DataMember(Name = "order", EmitDefaultValue = false)]
        public string Order { get; set; }

        /// <summary>
        /// The direction of the order: &#39;ASC&#39; or &#39;DESC&#39;
        /// </summary>
        /// <value>The direction of the order: &#39;ASC&#39; or &#39;DESC&#39;</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public string Sort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModGlossaryGetEntriesToApproveRequest {\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Letter: ").Append(Letter).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
