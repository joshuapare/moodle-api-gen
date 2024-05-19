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
    /// ModGlossaryGetEntriesByDateRequest
    /// </summary>
    [DataContract(Name = "mod_glossary_get_entries_by_date_request")]
    public partial class ModGlossaryGetEntriesByDateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesByDateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModGlossaryGetEntriesByDateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModGlossaryGetEntriesByDateRequest" /> class.
        /// </summary>
        /// <param name="from">Start returning records from here (default to 0).</param>
        /// <param name="id">Glossary entry ID (required).</param>
        /// <param name="limit">Number of records to return (default to 20).</param>
        /// <param name="options">options.</param>
        /// <param name="order">Order the records by: &#39;CREATION&#39; or &#39;UPDATE&#39;. (default to &quot;UPDATE&quot;).</param>
        /// <param name="sort">The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; (default to &quot;DESC&quot;).</param>
        public ModGlossaryGetEntriesByDateRequest(int from = 0, int id = default(int), int limit = 20, ModGlossaryGetEntriesByAuthorRequestOptions options = default(ModGlossaryGetEntriesByAuthorRequestOptions), string order = @"UPDATE", string sort = @"DESC")
        {
            this.Id = id;
            this.From = from;
            this.Limit = limit;
            this.Options = options;
            // use default value if no "order" provided
            this.Order = order ?? @"UPDATE";
            // use default value if no "sort" provided
            this.Sort = sort ?? @"DESC";
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
        /// Number of records to return
        /// </summary>
        /// <value>Number of records to return</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public ModGlossaryGetEntriesByAuthorRequestOptions Options { get; set; }

        /// <summary>
        /// Order the records by: &#39;CREATION&#39; or &#39;UPDATE&#39;.
        /// </summary>
        /// <value>Order the records by: &#39;CREATION&#39; or &#39;UPDATE&#39;.</value>
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
            sb.Append("class ModGlossaryGetEntriesByDateRequest {\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
